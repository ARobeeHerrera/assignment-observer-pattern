package observerpackage;

import java.util.List;

public class NewsAgency implements NewsSubject{

    private String newsUpdate;
    private List<Subscriber> subscribers;

    public String getNewsUpdate() {
        return newsUpdate;
    }

    public void setNewsUpdate(String newsUpdate) {
        this.newsUpdate = newsUpdate;
    }

    public void setSubscribers(List<Subscriber> subscribers) {
        this.subscribers = subscribers;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public String notifySubscribers() {
        String notify = "";
        for(Subscriber subscriber : subscribers) {
            notify +=  "Hey, " + subscriber.getSubscriberName() + "!\n";
            notify += newsUpdate + "\n";
        }
        return notify;
    }

}
