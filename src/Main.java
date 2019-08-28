import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    ArrayList<Worker> workers = new ArrayList();
    List<Task> tasks = new ArrayList<>();
    List<Goal> goals = new ArrayList<>();



    int duration ; // durata in giorni della simulazione
    int w; // worker a disposizione
    int t; // task a disposizione
    int g; // goals da svolgere


    public static void main(String [] args) throws IOException {

        /*BufferedReader reader = new BufferedReader(new FileReader("input_1.txt"));
        String line = reader.readLine();
        while(line!=null) {
            System.out.println(line);
            line = reader.readLine();
        }*/

         Main main = new Main();
        main.start();
        System.out.println("hh");


    }



    void start(){
        parserIn();

    }


    void parserIn(){
        try{

            BufferedReader bufferedReader = new BufferedReader(new FileReader("input_1.txt"));
            String firstLine = bufferedReader.readLine();
            Scanner scanner = new Scanner(firstLine);
            duration = scanner.nextInt();
            w = scanner.nextInt();
            t = scanner.nextInt();
            g = scanner.nextInt();

            // Create worker
            for(int i = 0; i < w; i++) {
                String line = bufferedReader.readLine();
                scanner = new Scanner(line);

                Worker worker = new Worker();
                List<Holidays> holidays = new ArrayList<>();
                List<String> skills = new ArrayList<>();
                worker.setId(scanner.nextInt());
                int nIntervalli = scanner.nextInt();
                for (int j = 0; j < nIntervalli; j++) {
                    Holidays holiday = new Holidays();
                    holiday.setHolidays(scanner.next());
                    holidays.add(holiday);
                }
                while (scanner.hasNext()) {
                    String skill = scanner.next();
                    skills.add(skill);

                }
                worker.setHolidays(holidays);
                worker.setSkills(skills);
                workers.add(worker);

            }

            for(int k = 0; k < t; k ++){
                Task newTask = new Task();
                String tline = bufferedReader.readLine();
                scanner = new Scanner(tline);
                int idTask = scanner.nextInt();
                int gW = scanner.nextInt();
                String  skill = scanner.next();
                newTask.setSkills(skill);
                ArrayList<Integer> deps = new ArrayList<>();
                while (scanner.hasNext()){
                    deps.add(scanner.nextInt());

                }
                newTask.setId(idTask);
                newTask.setDay_per_worker(gW);
                newTask.setTask_dip(deps);
                tasks.add(newTask);
            }
            System.out.println("prima parte");
            for(int a = 0; a < g; a ++){
                String gline = bufferedReader.readLine();
                scanner = new Scanner(gline);
                int id = scanner.nextInt();
                int day = scanner.nextInt();
                Goal goal = new Goal();
                goal.setId_task(id);
                goal.setDeadline(day);
                goals.add(goal);
            }

            System.out.println("prima parte");







        }catch (Exception e){
            System.out.println("prima parte");

        }
    }

}
