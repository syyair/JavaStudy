
public class Main {

	public static void main(String[] args) {
		
		//���ȼ��ɸߵ�������Ϊ��
		//this.show(O)��super.show(O)��this.show((super)O)��super.show((super)O)
		A a1 = new A();
		//����ת�ͣ���������ָ���������
		//����ת��ʱ������ʧ���븸�๲�е���������
		//����a2.show(b)�������B��show��B���������B��show��A��
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		a1.show(b);
		a1.show(c);
		a1.show(d);
		
		a2.show(b);
		a2.show(c);
		a2.show(d);
		
		b.show(b);
		b.show(c);
		b.show(d);
		b.show(e);
			
	}

}
