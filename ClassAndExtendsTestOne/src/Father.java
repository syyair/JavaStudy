
public class Father {

	//��Ա����
	Test test = new Test("father");
	
	//��̬����
	public static void faterStatic(){
		System.out.println("this is father static method");
	}
	
	//���췽��
	Father(){
		System.out.println("this is father constructor");
	}
	
	//���ι��췽��
	Father(String name){
		System.out.println("this is father String constructor");
	}
	
	//��������
	{
		System.out.println("this is father constructor code");
	}
	
	//��̬�����
	static {
		System.out.println("this is father static code");
	}
}
