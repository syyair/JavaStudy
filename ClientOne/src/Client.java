import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public class Client {
	public void connect(){
		
		try {
			//建立tcp链接
			Socket client = new Socket("10.18.25.223", 20006);
			//设置超时时间
			client.setSoTimeout(10000);
			//获取从键盘输入的数据
			BufferedReader readerClient = new BufferedReader(new InputStreamReader(System.in));
			//获取socket的输出流，发送到服务器上
			PrintStream print = new PrintStream(client.getOutputStream());
			//获取socket的输入流，接受服务器发送的数据
			BufferedReader readerServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			boolean flag = true;
			while(flag){
				System.out.println("请输入内容：");
				String str = readerClient.readLine();
				//发送数据到服务端
				print.println(str);
				//如果客户端输入bye就不再下一次发送数据
				if("bye".equals(str)){
					flag = false;
				}
				else{
					//接受服务器发送过来的数据，打印出来，如果超时给出提示
					try{
						String echo = readerServer.readLine();
						System.out.println(echo);
					} catch (SocketTimeoutException e){
						System.out.println("服务器超时，请重拾");
					}
				}
			}
			
			readerClient.close();
			readerServer.close();
			print.close();
			if(client != null){
				client.close();
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
