import java.util.Vector;


public class Main {

	public static void main(String[] args) {
		
		A a1 = new A();
		B b = new B();
		b.bStr = "haha";
		a1.name = "a";
		a1.nameArr[0] = "1";
		a1.nameArr[1] = "a1";
		Vector<B> vector = new Vector<B>();
		vector.add(b);
		a1.vectorB = vector;
		
		A a2 = new A();
		a2 = (A) a1.clone();
		a2.nameArr[1] = "a2";
		B b1 = new B();
		b1 = (B) b.clone();
		b1.bStr = "lalal";
		Vector<B> vector1 = new Vector<B>();
		vector1.add(b1);
		a2.vectorB = vector1;
		
		System.out.println(a1.nameArr[1] + "  " + a1.vectorB.get(0).bStr + "  " + a1.name);
		System.out.println(a2.nameArr[1] + "  " + a2.vectorB.get(0).bStr + "  " + a1.name);
	}

}
