
public class Eat extends Thread{

	Kitchen kitchen = new Kitchen();
	
	@Override
	public void run() {
		
		synchronized(this){
			while(kitchen.getCakeCount() > 0){
				kitchen.pop();
				try {
					sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				notifyAll();
			}
		}
		
//		if(kitchen.getCakeCount() <= 0){
//			try {
//				this.wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}
}
