package classes;

public class task {
    private String name;
    private boolean isComplete;

    public task(String name) {
        this.name = name;
        this.isComplete = false;
    }

    public String getName() {
        return name;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    public void setName(String name) {
        this.name = name;
    }
}
