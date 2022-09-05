import socialMedia.Connection;
import socialMedia.SocialMediaFeed;
import traffic.City;
import traffic.TrafficUpdates;

public class Main {

    public static void main(String[] args) {
        System.out.println("Connection.Observer \n");

        Connection sally = new Connection();
        Connection bob = new Connection();
        SocialMediaFeed socialMediaFeed = new SocialMediaFeed();

        sally.addPropertyChangeListener(socialMediaFeed);
        bob.addPropertyChangeListener(socialMediaFeed);

        sally.setStatus("going for a walk");
        bob.setStatus("eating my lunch");
        bob.setStatus("watching football match");
        bob.setStatus("i'm terrified");

        socialMediaFeed.printStatues();

        System.out.println("\nCity.Observer \n");
        City sunnyVille = new City();
        City springField = new City();
        TrafficUpdates trafficUpdates = new TrafficUpdates();

        sunnyVille.getPropertyChangeSupport(trafficUpdates);
        springField.getPropertyChangeSupport(trafficUpdates);

        sunnyVille.updateTraffic("Congestion is town center");
        springField.updateTraffic("Accident on the highway");

        trafficUpdates.getUpdates();
    }
}
