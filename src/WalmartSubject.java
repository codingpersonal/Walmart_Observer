import java.util.ArrayList;
import java.util.List;

public class WalmartSubject implements IWalmart {

	List <IObserver> observers = new ArrayList<>();
	String subjectState = "";

	@Override
	public void attach(IObserver obs) {
		observers.add(obs);
	}

	@Override
	public void detach(IObserver obs) {
		observers.remove(obs);		
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i < observers.size(); i++) {
			IObserver obj = observers.get(i);
			obj.update(subjectState);
		}
	}

	@Override
	public void setState(String state) {
		this.subjectState = state;
		notifyObservers();
	}

}
