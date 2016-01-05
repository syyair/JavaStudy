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
			//ֻ�л������ͺ�string���ͣ�ϵͳ�Ѿ���д��clone����
			a.nameArr = (String[])nameArr.clone();
			a.vectorB = new Vector<B>();
			for(int i = 0 ;i < vectorB.size() ;i ++){
				//vector���洫����B���ͣ� ���ǻ�������ҲҪ��дclone����
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
