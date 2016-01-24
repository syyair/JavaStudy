import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {

//	private Socket client = null;
	private ArrayList<Socket> clientArray = null;
	
	//传入一个客户端的scoket对象
	ServerThread(ArrayList<Socket> clientArray){
		this.clientArray = clientArray;
	}
	
	@Override
	public void run() {
		for (int i = 0 ;i < clientArray.size() ; i++){
			sendMessage(clientArray.get(i));
		}
	}
	
	public void sendMessage(Socket client){
		try {
			//获取socket输出流，向客户端发送数据
			PrintStream out = new PrintStream(client.getOutputStream());
			//获取socket输入流，接受客户端发送过来的数据
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			boolean flag = true;
			while(flag){
				String str = reader.readLine();
				if(str == null || "".equals(str)){
					flag = false;
				}else{
					if("bye".equals(str)){
						flag = false;
					}else{
						//讲接受到的字符串加上前缀，发送给客户端
						out.println("echo: " + str);
					}
				}
			}
			
			out.close();
			reader.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
