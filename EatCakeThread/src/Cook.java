
public class Cook extends Thread{

	Kitchen kitchen = new Kitchen();
	
	@Override
	public void run() {
		synchronized(this){
			while(kitchen.getCakeCount() <= kitchen.max){
				kitchen.push();
				try {
					//�߳�˯��ʱ������ӵ�е��κ����������ͷ�
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
