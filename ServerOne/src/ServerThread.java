import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;

public class ServerThread extends Thread {

	private Socket cliend = null;
	private ArrayList<Socket> cliendArray = null;
	
	//传入一个客户端的scoket对象
	ServerThread(Socket cliend, ArrayList<Socket> cliendArray){
		this.cliendArray = cliendArray;
		this.cliend = cliend;
	}
	
	@Override
	public void run() {
		
		PrintStream out = null;
		
		try {
			
			//获取socket输入流，接受客户端发送过来的数据
			BufferedReader reader = new BufferedReader(new InputStreamReader(cliend.getInputStream()));
			
			boolean flag = true;
			while(flag){
				String str = reader.readLine();
				if(str == null || "".equals(str)){
					flag = false;
				}else{
					if("bye".equals(str)){
						flag = false;
					}else{
						//获取socket输出流，向客户端发送数据,发送数据给所有客户端发送
						for(int i = 0 ; i < cliendArray.size() ; i++){
							out = new PrintStream(cliendArray.get(i).getOutputStream());
							//将接受到的字符串加上前缀，发送给客户端
							out.println("echo: " + str);
						}
					
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
