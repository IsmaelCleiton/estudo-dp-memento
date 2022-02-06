package classes;

import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class taskList {
    private List<task> tasks;

    public taskList() {
        tasks = new ArrayList<task>();
    }

    public List<task> getTasks() {
        return tasks;
    }

    public void setTasks(List<task> tasks) {
        this.tasks = tasks;
    }

    public boolean addTask(task t) {
        saveState("ADD in ");
        return tasks.add(t);
    }

    public boolean removeTask(task t) {
        saveState("RM in ");
        return tasks.remove(t);
    }

    public memento saveState(String type) {
        Date date = new Date(System.currentTimeMillis());
        return new concreteMemento(type + date.toString(), date, this.tasks);
    }

}
