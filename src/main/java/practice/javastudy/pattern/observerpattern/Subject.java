package practice.javastudy.pattern.observerpattern;

public interface Subject {

    /**
     * 객체 + 주체가 합쳐진 옵저버 패턴
     */
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObserver();
    public Object getUpdate(Observer observer);

}