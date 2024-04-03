package Homework5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Main1 {
        public static void main(String[] args) {
            List<Workers> workers = new ArrayList<>();
            workers.add(new Staff(1, "Shyngys", "Karaul", 13312));
            workers.add(new Staff(2, "Ermek", "Mustafinov", 23234));
            workers.add(new HRManagers(3, "Dairzhan Alpysbay", 324));
            workers.add(new HRManagers(4, "Lee woo", 123400));
            workers.add(new Programmers(5, "proger1", 5000, 1000, 0.89));
            workers.add(new Programmers(6, "debugger1", 5500, 1200, 1));
            Workers highestPaidWorker = Collections.max(workers, Comparator.comparingInt(Workers::getSalary));
            System.out.println("Worker with the highest salary: " + highestPaidWorker.getWorkerData());
            Collections.sort(workers, Comparator.comparingInt(Workers::getSalary).reversed());
            System.out.println("\nWorkers sorted by salary (descending):");
            for (Workers worker : workers) {
                System.out.println(worker.getWorkerData());
            }
        }
    }
