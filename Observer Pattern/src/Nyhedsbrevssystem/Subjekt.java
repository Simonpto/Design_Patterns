package Nyhedsbrevssystem;

public interface Subjekt {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
