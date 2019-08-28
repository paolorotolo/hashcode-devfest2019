import java.util.regex.Pattern;

public class Holidays {
    private int inizio;
    private int fine;

    public int getInizio() {
        return inizio;
    }

    public void setInizio(int inizio) {
        this.inizio = inizio;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public void setHolidays(String s){
        String[] splitted = s.split(Pattern.quote(":"));
        inizio = Integer.parseInt(splitted[0]);
        fine = Integer.parseInt(splitted[1]);
    }
}
