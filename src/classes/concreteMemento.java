package classes;

import java.util.Date;
import java.util.List;

public class concreteMemento implements memento {
    private String name;
    private Date date;
    private List<task> tasks;

    concreteMemento(String name, Date date, List<task> tasks) {
        this.name = name;
        this.date = date;
        this.tasks = tasks;
    }

    public List<task> getTasks() {
        return tasks;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDate() {

        return date.toString();
    }

}
