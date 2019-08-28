import java.util.List;

public class Worker {
    private int id;
    private String skills;
    private List<Holidays> holidays;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public List<Holidays> getHolidays() {
        return holidays;
    }

    public void setHolidays(List<Holidays> holidays) {
        this.holidays = holidays;
    }
}
