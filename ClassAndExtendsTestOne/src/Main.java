
public class Main {

	public static void main(String[] args) {
//		Test testOne = new Test();
//		Test testTwo = new Test();
//
//		new Meal();
//		new Circle();
		
//		Shape shape = new Circle();
//		System.out.println(shape.name);
//		shape.printType();
//		shape.printName();
//		shape.shapeMethod();
		
		//父类和子类的执行顺序
		//父类的静态代码块、子类的静态代码块
		//main方法
		//父类的成员变量初始化、父类的构造代码块、父类的构造函数
		//子类的成员变量初始化、子类的构造代码块、子类的构造函数
		SonOne sonOne = new SonOne();
		SonOne sonTwo = new SonOne();
		
	}

}

//class Meal{
//	public Meal(){
//		System.out.println("meal");
//	}
//	//先初始化成员变量，所以会先执行Bread的构造方法，再执行Meal的构造方法
//	//先初始化成员变量在执行构造方法
//	Bread bread = new Bread();
//}
//
//class Bread {
//	public Bread(){
//		System.out.println("bread");
//	}
//}


//class Draw{
//	public Draw(String type){
//		System.out.println(type + " draw constructor");
//	}
//}
//class Shape{
//	private Draw draw = new Draw("shape");
//	public Shape(){
//		System.out.println("shape constructor");
//	}
//}
//class Circle extends Shape{
//	//父类的初始化和构造器调用一定在子类的前面
//	private Draw draw  = new Draw("circle");
//	public Circle(){
//		System.out.println("circle constructor");
//	}
//}

//class Shape{
//	public String name = "shape";
//	
//	public Shape(){
//		System.out.println("shape constructor");
//	}
//	
//	public void printType(){
//		System.out.println("this is shape");
//	}
//	
//	public static void printName(){
//		System.out.println("shape");
//	}
//	
//	public void shapeMethod(){
//		System.out.println("this is shape method");
//	}
//}
//
//class Circle extends Shape{
//	public String name = "circle";
//	
//	public Circle(){
//		System.out.println("circle constrcutor");
//	}
//	
//	public void PrintType(){
//		System.out.println("this is circle");
//	}
//	
//	public static void printName(){
//		System.out.println("circle");
//	}
//	
//	public void circleMethod(){
//		System.out.println("this is circle method");
//	}
//}
