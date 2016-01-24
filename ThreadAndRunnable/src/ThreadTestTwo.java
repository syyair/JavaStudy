
public class ThreadTestTwo extends Thread{

	@Override
	public void run() {
		for( int i = 0 ;i < 50 ; i++){
			System.out.println(currentThread().getName() + "  " + i);
		}
	}
}
