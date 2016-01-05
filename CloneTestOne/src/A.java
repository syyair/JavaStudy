import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;


public class A implements Cloneable{

	public String name;
	public String[] nameArr = new String[2];
	public Vector<B> vectorB;

	@Override
	protected Object clone() {
		A a = null;
		try {
			a = (A)super.clone();
			//只有基本类型和string类型，系统已经重写过clone方法
			a.nameArr = (String[])nameArr.clone();
			a.vectorB = new Vector<B>();
			for(int i = 0 ;i < vectorB.size() ;i ++){
				//vector里面传的是B类型， 不是基本类型也要重写clone方法
				B b = (B)vectorB.get(i).clone();
				a.vectorB.add(b);
			}
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}
	
	
}
