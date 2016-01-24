
public class Cook extends Thread{

	private Kitchen kitchen = new Kitchen();
	
	Cook(Kitchen kitchen){
		this.kitchen = kitchen;
	}
	
	@Override
	public void run() {
		
		while(kitchen.cakeCount < kitchen.max){
			kitchen.push();
			try {
				//线程睡眠时，他所拥有的任何锁都不会释放
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	

}
