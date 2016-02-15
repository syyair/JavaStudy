import java.util.ArrayList;
import java.util.List;


public class Main {
	
	/**
	//向上转型，动态绑定
	static void drawTest(Shape shape){
		shape.draw();
	}
	
	/**
	//向上转型，静态绑定
	static void drawTest(Shape shape){
		shape.draw();
	}**/
	
	
	//向下转型例子2
	static void fight(ICanFight f){f.fight();}
	static void swim(ICanSwim s){s.swim();}
	static void fly(ICanFly f){f.fly();}
	static void action(ActionCharacter a){a.fight(); a.fight2();}
	
	public static void main(String[] args) {
		
//		int.class 是获取int 的引用类型对象
//		Class<Number> genericNumberClass = int.class ;
		
		/**
		//容器向下转型
		//虽然可以通过getClass().getName()得知List<Fruit>和List<Apple>同属java.util.ArrayList类型，
		//但是，假设这里可以编译通过，相当于允许向ArrayList<Apple>存放一个Orange对象，显然是不合理的。
		//虽然由于泛型的擦除，ArrayList<Fruit>和ArrayList<Apple>在运行期是同一种类型，但是具体能持有的元素类型会在编译期进行检查。
		List<Fruit> fruitFlist = new ArrayList<Apple>();
		List<Apple> fruitApple = new ArrayList<Fruit>();**/
		
		
		
		// 向上转型，调用指定的父类方法
		Circle circle = new Circle();
		//使用的是父类的方法，一定是用父类的方法。可以传入子类
		Shape shape = new Shape();
		//使用的是父类的draw方法，传入的circle可以向上转型为shape
		shape.draw(circle);
		
		/**
		//向上转型，动态绑定
		Circle circle1 = new Circle();
		//传入的circle向上转型为shape，但是使用的是cricle的draw方法
		drawTest(circle1);
		
		/**
		//向上转型，动态绑定
		Circle circle = new Circle();
		//传入的circle向上转型为shape，但是使用的是cricle的draw方法
		//Java中除了static方法和final方法（包括private方法），其他方法都是动态绑定的。
		//静态方法子类不能重写
		drawTest(circle);**/
		
		/**
		//向下转型
		Useful[] useStr = {new Useful(), new MoreUseful()};
		useStr[0].f();
		useStr[0].g();
		useStr[1].f();
		useStr[1].g();
		//useStr 是一个Useful类型，向下转型成MoreUseful类型
		//虽然父类Useful类型的x[1]接收了一个子类MoreUseful对象的引用，但仍然不能直接调用其子类中的u()方法。如果需要调用，需要做向下转型。
		((MoreUseful)useStr[1]).u();
		//异常 Exception in thread "main" java.lang.ClassCastException: Useful cannot be cast to MoreUseful
		//useStr[0]是父类对象不能向下转型为子类对象
		//((MoreUseful)useStr[0]).u();**/
		
		
		//向下转型例子2
		Hero h = new Hero();
		fight(h);
		swim(h);
		fly(h);
		action(h);

	}

}


//向上转型，调用指定的父类方法
class Shape{
	public void draw(Shape shape){
		System.out.println("this is shape");
	}

}

class Circle extends Shape{
	//Java中除了static方法和final方法（包括private方法），其他方法都是动态绑定的。
	public void draw(Circle circle){
		System.out.println("this is circle");
	}
	
}

/**
//向上转型动态绑定
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
//向上转型静态绑定
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
//向下转型
class Useful{
	public void f(){System.out.println("this is f() useful");}
	public void g(){System.out.println("this is g() useful");}
}
class MoreUseful extends Useful{
	public void f(){System.out.println("this is f() MoreUseful");}
	public void g(){System.out.println("this is g() MoreUseful");}
	public void u(){System.out.println("this is u() MoreUseful");}
}**/


//向下转型例子2
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


//容器向下转型
class Fruit{}

class Apple extends Fruit{}

class Orange extends Fruit{}






