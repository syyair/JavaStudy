import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerOne {

	public void connet(){
		
		try {
			//在20006端口监听客户端的tcp请求
			ServerSocket server = new ServerSocket(20006);
			ArrayList<Socket> cliendArray = new ArrayList<Socket>();
			Socket cliend = null;
			boolean flag = true;
			while(flag){
				//等待客户端的链接
				cliend = server.accept();
				System.out.println("与客户端链接成功");
				cliendArray.add(cliend);
				//为每个客户端开启一个线程
				ServerThread serverThread = new ServerThread(cliend,cliendArray);
				serverThread.start();
			}
			
			server.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
