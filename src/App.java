import classes.task;
import classes.taskList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        taskList list = new taskList();
        list.addTask(new task("Primeira"));

    }
}
