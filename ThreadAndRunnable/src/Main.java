import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		ThreadTestOne one = new ThreadTestOne();
		//one.start() 是启动了线程
		//one.run() 就是调用了一个普通的方法
//		one.start();
//		one.run();
//		
//		ThreadTestOne two = new ThreadTestOne();
//		two.start();
		
//		one.run();
		
//		RunnableTestOne one = new RunnableTestOne();
//		Thread thread = new Thread(one);
//		thread.start();
//		Thread thread2 = new Thread(one);
//		thread2.start();
		
		//Main函数也是一个线程
//		for(int i = 0; i< 10 ; i++){
//			System.out.println(Thread.currentThread().getName() + "  " + i);
//		}
		
		ThreadTestTwo tt = new ThreadTestTwo();
		
		tt.run();
		try {
			int data = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tt.start();

	}

}
