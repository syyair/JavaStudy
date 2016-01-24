
public class Cook extends Thread{

	Kitchen kitchen = new Kitchen();
	
	@Override
	public void run() {
		synchronized(this){
			while(kitchen.getCakeCount() <= kitchen.max){
				kitchen.push();
				try {
					//线程睡眠时，他所拥有的任何锁都不会释放
					sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				notifyAll();
			}
		}

		if(kitchen.getCakeCount() > kitchen.max){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
