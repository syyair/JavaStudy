import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//为什么一定要写final public 不行，public和static不允许修饰局部变量
		//要比较的对象本身没有实现comparable接口的时候就需要定义一个comparator对象，重写compare方法进行比较
		Comparator<People> comparator = new Comparator<People>(){

			@Override
			public int compare(People arg0, People arg1) {
				
				if(arg0.getId() > arg1.getId()){
					return 1;
				}else if(arg0.getId() == arg1.getId()){
					
					return 0;
				}
				else {
					return -1;
				}
				//为什么这个就不用一定再写一个返回
//				return arg0.compareTo(arg1);
			}
			
		};
		
		People p1 = new People("sunyingying", 2);
		People p2 = new People("yuebinbin", 1);
		List<People> listP = new ArrayList<People>();
		listP.add(p1);
		listP.add(p2);
		
		System.out.println("before");
		for(People p : listP){
			System.out.println(p.getId() + "  " + p.getName());
		}
		
		Collections.sort(listP,comparator);
		//如果要比较的对象实现了comparable接口的comparato方法，就可以适用sort方法了
//		Collections.sort(listP);
		
		System.out.println("after");
		for(People p : listP){
			System.out.println(p.getId() + "  " + p.getName());
		}
		
	}

}
