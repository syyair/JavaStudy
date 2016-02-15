import java.util.ArrayList;
import java.util.List;


public class Main {
	
	/**
	//����ת�ͣ���̬��
	static void drawTest(Shape shape){
		shape.draw();
	}
	
	/**
	//����ת�ͣ���̬��
	static void drawTest(Shape shape){
		shape.draw();
	}**/
	
	
	//����ת������2
	static void fight(ICanFight f){f.fight();}
	static void swim(ICanSwim s){s.swim();}
	static void fly(ICanFly f){f.fly();}
	static void action(ActionCharacter a){a.fight(); a.fight2();}
	
	public static void main(String[] args) {
		
//		int.class �ǻ�ȡint ���������Ͷ���
//		Class<Number> genericNumberClass = int.class ;
		
		/**
		//��������ת��
		//��Ȼ����ͨ��getClass().getName()��֪List<Fruit>��List<Apple>ͬ��java.util.ArrayList���ͣ�
		//���ǣ�����������Ա���ͨ�����൱��������ArrayList<Apple>���һ��Orange������Ȼ�ǲ�����ġ�
		//��Ȼ���ڷ��͵Ĳ�����ArrayList<Fruit>��ArrayList<Apple>����������ͬһ�����ͣ����Ǿ����ܳ��е�Ԫ�����ͻ��ڱ����ڽ��м�顣
		List<Fruit> fruitFlist = new ArrayList<Apple>();
		List<Apple> fruitApple = new ArrayList<Fruit>();**/
		
		
		
		// ����ת�ͣ�����ָ���ĸ��෽��
		Circle circle = new Circle();
		//ʹ�õ��Ǹ���ķ�����һ�����ø���ķ��������Դ�������
		Shape shape = new Shape();
		//ʹ�õ��Ǹ����draw�����������circle��������ת��Ϊshape
		shape.draw(circle);
		
		/**
		//����ת�ͣ���̬��
		Circle circle1 = new Circle();
		//�����circle����ת��Ϊshape������ʹ�õ���cricle��draw����
		drawTest(circle1);
		
		/**
		//����ת�ͣ���̬��
		Circle circle = new Circle();
		//�����circle����ת��Ϊshape������ʹ�õ���cricle��draw����
		//Java�г���static������final����������private�������������������Ƕ�̬�󶨵ġ�
		//��̬�������಻����д
		drawTest(circle);**/
		
		/**
		//����ת��
		Useful[] useStr = {new Useful(), new MoreUseful()};
		useStr[0].f();
		useStr[0].g();
		useStr[1].f();
		useStr[1].g();
		//useStr ��һ��Useful���ͣ�����ת�ͳ�MoreUseful����
		//��Ȼ����Useful���͵�x[1]������һ������MoreUseful��������ã�����Ȼ����ֱ�ӵ����������е�u()�����������Ҫ���ã���Ҫ������ת�͡�
		((MoreUseful)useStr[1]).u();
		//�쳣 Exception in thread "main" java.lang.ClassCastException: Useful cannot be cast to MoreUseful
		//useStr[0]�Ǹ������������ת��Ϊ�������
		//((MoreUseful)useStr[0]).u();**/
		
		
		//����ת������2
		Hero h = new Hero();
		fight(h);
		swim(h);
		fly(h);
		action(h);

	}

}


//����ת�ͣ�����ָ���ĸ��෽��
class Shape{
	public void draw(Shape shape){
		System.out.println("this is shape");
	}

}

class Circle extends Shape{
	//Java�г���static������final����������private�������������������Ƕ�̬�󶨵ġ�
	public void draw(Circle circle){
		System.out.println("this is circle");
	}
	
}

/**
//����ת�Ͷ�̬��
class Shape{
	public void draw(){
		System.out.println("this is shape");
	}
}
class Circle extends Shape{
	public void draw(){
		System.out.println("this is circle");
	}
}

/**
//����ת�;�̬��
class Shape{
	public static void draw(){
		System.out.println("this is shape");
	}
}
class Circle extends Shape{
	public static void draw(){
		System.out.println("this is circle");
	}
}**/

/**
//����ת��
class Useful{
	public void f(){System.out.println("this is f() useful");}
	public void g(){System.out.println("this is g() useful");}
}
class MoreUseful extends Useful{
	public void f(){System.out.println("this is f() MoreUseful");}
	public void g(){System.out.println("this is g() MoreUseful");}
	public void u(){System.out.println("this is u() MoreUseful");}
}**/


//����ת������2
interface ICanFight{
	void fight();
}
interface ICanSwim{
	void swim();
}
interface ICanFly{
	void fly();
}
class ActionCharacter{
	public void fight(){
		System.out.println("this is actioncharacter fight()");
	}
	public void fight2(){
		System.out.println("this is actioncharacter fight2()");
	}
}

class Hero extends ActionCharacter implements ICanFight, ICanSwim, ICanFly{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("this is hero fly()");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("this is hero swim()");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("this is hero fight()");
	}
	
	public void fight2(){
		System.out.println("this is hero fight2()");
	}
	
}


//��������ת��
class Fruit{}

class Apple extends Fruit{}

class Orange extends Fruit{}






