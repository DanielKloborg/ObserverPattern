package opgave;

import java.util.ArrayList;

public class ConSubject implements Subject {
	
	private int state;
	private ArrayList<Observer> observers;
		
	public ConSubject(int value) {
		observers = new ArrayList<Observer>();
		changeState(value);
	}

	public void changeState(int value) {
	    state = value;
	    update(value);
	}
	
	private void update(int temp) {
		for (Observer observer : observers) {
			observer.update(this);
			fireCheck(temp);
		}
	}
	
	public void fireCheck(int value) {
		int maxTemp = 5;
		if(maxTemp <= value) {
			System.out.println("Alarm! Temp is at " + value + "!");
		}
	}
	
	public int getState() {
		return state;
	}
	
	public void addObserver(Observer obs) {
		observers.add(obs);
	}

	public void deleteObserver(Observer obs) {
		observers.add(obs);
	}
}