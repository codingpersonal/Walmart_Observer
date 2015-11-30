
public interface IWalmart {	
	void attach(IObserver obs);
	void detach(IObserver obs);
	void notifyObservers();
	void setState(String state);
}
