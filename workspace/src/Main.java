import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ϊʲôһ��Ҫдfinal public ���У�public��static���������ξֲ�����
		//Ҫ�ȽϵĶ�����û��ʵ��comparable�ӿڵ�ʱ�����Ҫ����һ��comparator������дcompare�������бȽ�
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
				//Ϊʲô����Ͳ���һ����дһ������
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
		//���Ҫ�ȽϵĶ���ʵ����comparable�ӿڵ�comparato�������Ϳ�������sort������
//		Collections.sort(listP);
		
		System.out.println("after");
		for(People p : listP){
			System.out.println(p.getId() + "  " + p.getName());
		}
		
	}

}
