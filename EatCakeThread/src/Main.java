
public class Main {

	public static void main(String[] args) {
		
		Kitchen kitchen = new Kitchen();
		Cook cooker1 = new Cook(kitchen);
		Cook cooker2 = new Cook(kitchen);
		Cook cooker3 = new Cook(kitchen);
		Eat eater1 = new Eat(kitchen);
		Eat eater2 = new Eat(kitchen);
		Eat eater3 = new Eat(kitchen);
		Eat eater4 = new Eat(kitchen);
		Eat eater5 = new Eat(kitchen);
		Eat eater6 = new Eat(kitchen);
		
		cooker1.start();
		cooker2.start();
		cooker3.start();
		eater1.start();
		eater2.start();
		eater3.start();
		eater4.start();
		eater5.start();
		eater6.start();

	}

}
