
//这个类是彩票中心的逻辑，不是彩票的逻辑，所以要封装出来一个类，不能喝latterybase类里混合，
//latterybase里面是实现彩票的逻辑。彩票中心还有其他功能，不只是生成彩票的功能。
public class LotteryCentre {

	public void createLottery (LotteryBase lottery) {
		System.out.println("您好！这里是彩票中心");
		System.out.println("您购买的" + lottery.count + "注" + lottery.name + "彩票号码是：");
		lottery.createNum();
		lottery.printAll(lottery);
		System.out.println("谢谢您的购买，欢迎下次再来！");
		System.out.println("<<----------------------------------->>");
	}
}
