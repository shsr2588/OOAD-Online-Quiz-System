
package quizsystem.observer;

import java.util.ArrayList;
import java.util.List;

// Observer Interface
public interface Observer {
    void update(String message);
}

// Subject Interface
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}

