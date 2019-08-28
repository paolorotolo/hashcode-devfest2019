import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solver {

    public static List<Worker> filterWorker(Task task, List<Worker> workers){//filtro in base alle skills


        return workers.stream().filter(w-> w.getSkills().equals(task.getSkill())).collect(Collectors.toList());
    }

    static List<Day> getListDay(Task task,int duration){
        List<Day> listDay = new ArrayList<>();
        for(int i =0; i<duration; i++){
            Day day= new Day();
            day.index=i+1;
            List<Worker> listWorker= task.getWorkersCanDoTask();
            task
        }
        return listDay;
    }


}
