package opgave;

public class Main {

	public static void main(String[] args) {
		ConSubject subject = new ConSubject(1);

		new ConObserver(subject, "Observer");

	    subject.changeState(2);
	    subject.changeState(3);
	    subject.changeState(4);
	    subject.changeState(5); 
	}
}
