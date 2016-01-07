
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark("wang", 5);
		dog.bark(456, "wang456");
		
		//当上例中Father类speak()方法被private时，Son类不能重写出Father类speak()方法，
		//此时Son类speak()方法相当与在Son类中定义的一个speak()方法。

		//Father类speak()方法一但被final时，无论该方法被public,protected及默认所修饰时，
		//Son类根本不能重写Father类speak()方法，
		//Father类speak()方法被默认修饰时，只能在同一包中，被其子类被重写，如果不在同一包则不能重写。
		//Father类speak()方法被protoeted时，不仅在同一包中，被其子类被重写，还可以不同包的子类重写。
		
	}

}
