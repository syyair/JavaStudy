import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;


public abstract class LotteryBase {
	List<Integer> list = new ArrayList<Integer>();
	public int count, last;
	public String name;
	
	public abstract List<Integer> createNum();
	
	//随机产生count个最大数是max的不重复数，返回list
	public List<Integer> createNumPart(int count , int max){
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		Random random = new Random();
		
		while(set.size() < count){
			int num = Math.abs((random.nextInt() % max)) + 1;
			set.add(num);
		}
		Iterator<Integer> iterator = set.iterator();
		while(iterator.hasNext()){
			list.add(iterator.next());
		}
		Collections.sort(list);
		return list;
	}
	
	//打印所有
	public void printAll(LotteryBase lottery){
		List<Integer> listOne = new ArrayList<Integer>();
		while(count > 0){
			listOne = lottery.createNum();
			//打印前半部分
			for(int i = 0 ;i < last - 1 ; i++){
				System.out.print(listOne.get(i) + " ");
			}
			System.out.print("    ");
			//打印后半部分
			for(int i = last - 1 ; i < listOne.size() ; i++){
				System.out.print(listOne.get(i) + " ");
			}
			System.out.println();
			count--;
		}
	}
	
}
