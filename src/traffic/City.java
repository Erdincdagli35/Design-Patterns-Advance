package traffic;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class City {

    private String trafficUpdate = "";

    final private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void updateTraffic(String trafficUpdate) {
        support.firePropertyChange("update", this.trafficUpdate, trafficUpdate);
        this.trafficUpdate = trafficUpdate;
    }

    public void getPropertyChangeSupport(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
