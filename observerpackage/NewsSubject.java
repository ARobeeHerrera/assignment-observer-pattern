package observerpackage;

public interface NewsSubject {
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public String notifySubscribers();
}
