
public class Main {
//  没有特殊要求就不要声明称全局变量，尤其还是static的,static消耗的内存最大，其次是全局变量，最小的是成员变量
//	static LotteryBase shuangseqiu = new Shuangseqiu();
//	static LotteryBase daletou = new Daletou();
	public static void main(String[] args) {
		LotteryCentre lc = new  LotteryCentre();
		
		LotteryBase shuangseqiu = new Shuangseqiu(5,"双色球",7);
		LotteryBase daletou = new Daletou(3, "大乐透", 6);
		
		lc.createLottery(shuangseqiu);
		lc.createLottery(daletou);
	}

}
