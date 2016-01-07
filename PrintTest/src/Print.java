
public class Print {
	
	
	//不用多态机制的时候要打印三个形状需要些三个方法
	public void printCircle(){
		System.out.println("this is circle print");
	}
	
	public void printCube(){
		System.out.println("this is cube print");
	}
	
	public void printCapuse(){
		System.out.println("this is capuse print");
	}
	
	//使用多态机制
	
	public String name = "print";
	public void print(){
		System.out.println("this is " + name);
	}

}
