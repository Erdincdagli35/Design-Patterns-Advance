package socialMedia;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class SocialMediaFeed implements PropertyChangeListener {

    final private ArrayList<String> statuses = new ArrayList<>();

    public void printStatues() {
        statuses.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        statuses.add((String) event.getNewValue());
    }
}
