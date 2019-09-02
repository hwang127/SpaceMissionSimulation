import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {
        File file= new File("Phase1.txt");
        Simulation s=new Simulation(file);

        int money=s.runSimulation(s.loadU1(s.loadItems(file)));
        System.out.println(money);
    }
}
