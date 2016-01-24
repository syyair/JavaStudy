
public class Kitchen {

	private int cakeCount = 0;
	public int max = 10;

	public synchronized void push(){
		cakeCount++;
		System.out.println(Thread.currentThread().getName() + "   cake��1��Ŀǰcakeһ���У� " + cakeCount);
	}
	
	public synchronized void pop(){
		cakeCount--;
		System.out.println(Thread.currentThread().getName() + "   cake��1��Ŀǰcakeһ���У� " + cakeCount);
	}

	public int getCakeCount() {
		return cakeCount;
	}

}
