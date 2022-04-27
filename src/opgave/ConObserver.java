package opgave;

public class ConObserver implements Observer {
	private int state;
	private String name;

	public ConObserver(Subject subject, String name) {
		this.name = name;
		subject.addObserver(this);
	}

	public void update(Subject sub) {
		if (sub instanceof ConSubject) {
			state = ((ConSubject) sub).getState();
		    System.out.println(name + ": Subject changed to " + state);
		}
	}
}        
