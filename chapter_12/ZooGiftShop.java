public class ZooGiftShop {
	abstract class SaleTodayOnly {
		int basePrice;
		SaleTodayOnly(int basePrice){
			this.basePrice = basePrice;
		}
		abstract int dollarsOff();
	}

	public int admission (int basePrice) {
		SaleTodayOnly sale = new SaleTodayOnly(basePrice){
			int dollarsOff(){
				return this.basePrice - 3;
			}
		};

		return  sale.dollarsOff();
	}

	public static void main(String[] args){
		System.out.println(new ZooGiftShop().admission(5));
	}

	static {
		class A{}
	}
}
