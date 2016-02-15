
public class Father {

	//成员变量
	Test test = new Test("father");
	
	//静态方法
	public static void faterStatic(){
		System.out.println("this is father static method");
	}
	
	//构造方法
	Father(){
		System.out.println("this is father constructor");
	}
	
	//含参构造方法
	Father(String name){
		System.out.println("this is father String constructor");
	}
	
	//构造代码块
	{
		System.out.println("this is father constructor code");
	}
	
	//静态代码块
	static {
		System.out.println("this is father static code");
	}
}
