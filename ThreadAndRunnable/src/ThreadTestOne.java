
public class ThreadTestOne extends Thread{

	private int a = 0;
	
	@Override
	public void run() {
		for (a  = 0; a< 10 ; a++){
			System.out.println(Thread.currentThread().getName() + "  " + a);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
