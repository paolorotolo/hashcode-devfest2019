import java.util.List;

public class Task  {
    private int id;
    private int day_per_worker;
    private String skill;
    private List<Integer> task_dip;
    boolean done = false;



    private List<Worker> workersCanDoTask;

    public List<Worker> getWorkersCanDoTask() {
        return workersCanDoTask;
    }

    public void setWorkersCanDoTask(List<Worker> workersCanDoTask) {
        this.workersCanDoTask = workersCanDoTask;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDay_per_worker() {
        return day_per_worker;
    }

    public void setDay_per_worker(int day_per_worker) {
        this.day_per_worker = day_per_worker;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkills(String skill) {
        this.skill = skill;
    }

    public List<Integer> getTask_dip() {
        return task_dip;
    }

    public void setTask_dip(List<Integer> task_dip) {
        this.task_dip = task_dip;
    }


}
