package observerpackage;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Subscriber rob = new Subscriber();
        rob.setSubscriberName("Rob");

        Subscriber bee = new Subscriber();
        bee.setSubscriberName("Bee");

        Subscriber bor = new Subscriber();
        bor.setSubscriberName("Bor");

        List<Subscriber> subscribers = new ArrayList<>();
        subscribers.add(rob);
        subscribers.add(bee);
        subscribers.add(bor);

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.setNewsUpdate("News Update: We have a sunny afternoon today so make sure to bring umbrellas");
        newsAgency.setSubscribers(subscribers);

        System.out.println("Updates!");
        System.out.println(newsAgency.notifySubscribers());

        newsAgency.unsubscribe(bor);

        Subscriber robZ = new Subscriber();
        robZ.setSubscriberName("RobZ");
        newsAgency.subscribe(robZ);

        System.out.println("Updates!");
        System.out.println(newsAgency.notifySubscribers());
    }
}
