package socialMedia;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {
    private String status = "";

    final private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void setStatus(String status) {
        support.firePropertyChange("status", this.status, status);
        this.status = status;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
