
public class Kitchen {

	private int cakeCount = 0;
	public int max = 10;

	public synchronized void push(){
		cakeCount++;
		System.out.println(Thread.currentThread().getName() + "   cake加1，目前cake一共有： " + cakeCount);
	}
	
	public synchronized void pop(){
		cakeCount--;
		System.out.println(Thread.currentThread().getName() + "   cake减1，目前cake一共有： " + cakeCount);
	}

	public int getCakeCount() {
		return cakeCount;
	}

}
