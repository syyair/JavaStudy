
public class Main {

	public static void main(String[] args) {
		
		//优先级由高到低依次为：
		//this.show(O)、super.show(O)、this.show((super)O)、super.show((super)O)
		A a1 = new A();
		//向上转型，父类引用指向子类对象
		//向上转型时，会遗失除与父类共有的其他方法
		//所以a2.show(b)不会调用B的show（B），会调用B的show（A）
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
