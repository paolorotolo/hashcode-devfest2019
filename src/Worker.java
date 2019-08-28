import java.util.List;

public class Worker {
    private int id;
    private List<String> skills;
    private List<Holidays> holidays;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public List<Holidays> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holidays> holidays) {
        this.holidays = holidays;
    }
}
