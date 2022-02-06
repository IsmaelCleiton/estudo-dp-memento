package classes;

import java.util.ArrayList;
import java.util.List;

public class careTaker {
    List<memento> mementos;

    careTaker() {
        mementos = new ArrayList<memento>();
    }

    public boolean add(memento m) {
        return mementos.add(m);
    }

    public memento getMementos(int index) {
        return mementos.get(index);
    }
}
