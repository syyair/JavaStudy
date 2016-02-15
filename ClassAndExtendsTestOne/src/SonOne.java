
public class SonOne extends Father{
	
		//成员变量
		Test test = new Test("sonOne");
		
		//静态方法
		public static void sonOneStatic(){
			System.out.println("this is sonOne static method");
		}
		
		//构造方法
		SonOne(){
			System.out.println("this is sonOne constructor");
		}
		
		//含参构造方法
		SonOne(String name){
			System.out.println("this is sonOne String constructor");
		}
		
		//构造代码块
		{
			System.out.println("this is sonOne constructor code");
		}
		
		//静态代码块
		static {
			System.out.println("this is sonOne static code");
		}
}
