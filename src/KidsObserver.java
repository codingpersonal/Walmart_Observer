
public class KidsObserver implements IObserver{

	public KidsObserver(IWalmart obj) {
		obj.attach(this);
	}
	@Override
	public void update(String state) {
		if(state.equals("Car")) {
			System.out.println("Kids Observer Notified, CAR in stock now. Add to CART");
		}
	}
}
