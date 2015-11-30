
public class NotificationSystem {

	public static void main(String[] args) {
		
		IWalmart walmart = new WalmartSubject();
		Inventory inv = new Inventory();
		IObserver obs_1 = new KidsObserver(walmart);
		IObserver obs_2 = new StudentObserver(walmart);
		
		if(inv.checkCar()) {
			walmart.setState("Car");
		}
		if(inv.checkLaptop()) {
			walmart.setState("Laptop");
		}
	}

}
