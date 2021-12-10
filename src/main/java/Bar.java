import java.util.ArrayList;
import java.util.List;

public class Bar{
    private boolean happyhour = false;
    private List<BarObserver> observers;
    public Bar(){
        observers = new ArrayList<BarObserver>();
    }

    public boolean isHappyHour() {
        return happyhour;
    }
    public void startHappyHour() {
        happyhour = true;
        this.notifyObservers();
    }
    public void endHappyHour() {
        happyhour = false;
        this.notifyObservers();
    }

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
