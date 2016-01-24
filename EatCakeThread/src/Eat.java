
public class Eat extends Thread{

	private Kitchen kitchen = new Kitchen();
	
	Eat(Kitchen kitchen){
		this.kitchen = kitchen;
	}
	
	@Override
	public void run() {
		
			while(kitchen.getCakeCount() > 0){
				kitchen.pop();
				try {
					sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}
