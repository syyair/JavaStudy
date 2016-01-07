
public class Dog {
	
	Dog(){
		this.bark();
	}
	
	public void bark(){
		System.out.println("no barking!");
		this.bark("wangwang",10);
	}

	public void bark(String name , double time){
		System.out.println(name + " is barking : " + time);
		this.bark(123,"wangwang123");
	}
	
	public void bark(int id , String name){
		System.out.println(id + " is name : " + name);
		
	}
}
