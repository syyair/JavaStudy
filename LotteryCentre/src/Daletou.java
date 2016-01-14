import java.util.ArrayList;
import java.util.List;


public class Daletou extends LotteryBase{

	List<Integer> list = new ArrayList<Integer>();

	Daletou(int count, String name, int last){
		super.count = count;
		super.name = name;
		super.last = last;
	}
	
	@Override
	public List<Integer> createNum() {
		list = createNumPart(5, 35);
		List<Integer> listTemp = new ArrayList<Integer>();
		listTemp = createNumPart(2, 12);
		for(int i = 0 ; i < listTemp.size() ; i++){
			list.add(listTemp.get(i));
		}
		return list;
	}

}
