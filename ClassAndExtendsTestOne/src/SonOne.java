
public class SonOne extends Father{
	
		//��Ա����
		Test test = new Test("sonOne");
		
		//��̬����
		public static void sonOneStatic(){
			System.out.println("this is sonOne static method");
		}
		
		//���췽��
		SonOne(){
			System.out.println("this is sonOne constructor");
		}
		
		//���ι��췽��
		SonOne(String name){
			System.out.println("this is sonOne String constructor");
		}
		
		//��������
		{
			System.out.println("this is sonOne constructor code");
		}
		
		//��̬�����
		static {
			System.out.println("this is sonOne static code");
		}
}
