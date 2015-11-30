
public class StudentObserver implements IObserver{

	public StudentObserver(IWalmart obj) {
		obj.attach(this);
	}
	
	@Override
	public void update(String state) {
		if(state.equals("Laptop")) {
			System.out.println("Student Observer Notified, LAPTOP in stock. ADD to CART");
		}
	}
}
