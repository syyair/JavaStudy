
public class Main {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark("wang", 5);
		dog.bark(456, "wang456");
		
		//��������Father��speak()������privateʱ��Son�಻����д��Father��speak()������
		//��ʱSon��speak()�����൱����Son���ж����һ��speak()������

		//Father��speak()����һ����finalʱ�����۸÷�����public,protected��Ĭ��������ʱ��
		//Son�����������дFather��speak()������
		//Father��speak()������Ĭ������ʱ��ֻ����ͬһ���У��������౻��д���������ͬһ��������д��
		//Father��speak()������protoetedʱ��������ͬһ���У��������౻��д�������Բ�ͬ����������д��
		
	}

}
