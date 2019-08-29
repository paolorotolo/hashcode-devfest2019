import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solver {

    public static List<Worker> filterWorker(Task task, List<Worker> workers){//filtro in base alle skills

        return workers.stream().filter(w-> w.getSkills().equals(task.getSkill())).collect(Collectors.toList());
    }

    static List<Day> getListDay(List<Task> tasks,int duration){
        List<Day> listDay = new ArrayList<>();
        for(int i =0; i<duration; i++){
            ArrayList<Integer> workerImpegnati = new ArrayList<>();
            Day day= new Day();
            List<Worker> workerList = new ArrayList<>();
            day.index=i+1;
            for (Task task: tasks
                 ) {
                List<Worker> listWorker= task.getWorkersCanDoTask();
                int effort= task.getDay_per_worker();
                for (Worker worker: listWorker) {
                    if(effort==0) break;
                    if (getAvalaible(worker,workerImpegnati)){
                        workerImpegnati.add(worker.getId());
                        task.setDay_per_worker(task.getDay_per_worker()-1);
                        workerList.add(worker);
                    }
                }
                day.mapDay.put(task, workerList);

            }

            listDay.add(day);
            //task.setDay_per_worker(task.getDay_per_worker()-listWorker.size());
        }
        return listDay;
    }

    static boolean getAvalaible(Worker worker, ArrayList<Integer> listWorker){
        for (Integer work: listWorker
             ) {
            if(worker.getId()==work)return false;

        }
        return true;
    }

}
