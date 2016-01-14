import java.util.ArrayList;
import java.util.List;


public class Shuangseqiu extends LotteryBase{
	
	List<Integer> list = new ArrayList<Integer>();
	
	Shuangseqiu(int count, String name, int last){
		super.count = count;
		super.name = name;
		super.last = last;
	}

	public List<Integer> createNum(){

		//产生6个红球
		list = super.createNumPart(6, 33);
		//产生1个蓝球
		int blue = super.createNumPart(1, 16).get(0);
		list.add(blue);
		
		return list;
	}
	
	
}
