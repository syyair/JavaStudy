
public class A {

	public void show(D obj){
		System.out.println("A and D");
	}
	
	public void show(A obj){
		System.out.println("A and A");
	}
}

class B extends A{
	
	public void show(B obj){
		System.out.println("B and B");
	}
	
	public void show(A obj){
		System.out.println("B and A");
	}
}

class C extends B{
	
}

class D extends B{
	
}

class E extends B{
	
}