
public class Kitchen {

	public int cakeCount = 0;
	public int max = 10;

	//Exception in thread "Thread-1" java.lang.IllegalMonitorStateException
	//出现上面异常的三种情况：
	//1>前线程含前象锁资源候调用obj.wait();
	//2>前线程含前象锁资源候调用obj.notify()
	//3>前线程含前象锁资源候调用obj.notifyAll()
	
	public synchronized void push(){
		if(cakeCount < max){
			cakeCount++;
			System.out.println(Thread.currentThread().getName() + "   cake加1，目前cake一共有 ： " + cakeCount);
			notifyAll();
		}
		else{
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public synchronized void pop(){
		if(cakeCount <= 0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			cakeCount--;
			System.out.println(Thread.currentThread().getName() + "   cake减1，目前cake一共有 ： " + cakeCount);
		}
		
	}

	public int getCakeCount() {
		return cakeCount;
	}

}
