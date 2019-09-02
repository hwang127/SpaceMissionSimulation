import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Simulation {
    String file;
    Simulation(File file){

    }
    public ArrayList loadItems(File file)  throws FileNotFoundException{

        ArrayList<Item> itemList=new ArrayList<Item>();
        Scanner scanner=new Scanner(file);
        int i=0;
        while (scanner.hasNextLine()){
            String line=scanner.nextLine();
            itemList.add(new Item(line.split("=")[0],line.split("=")[1]));
            //System.out.println(line.split("=")[1]);
            i=i+1;
        }
        return itemList;
    }
    public ArrayList loadU1(ArrayList<Item> itemList){

        U1 u=new U1();
        ArrayList<U1> result=new ArrayList<U1>();
        for (final Item i: itemList){
            if (u.canCarry(i)){
                u.carry(i);

            }else{
                result.add(u);
                u=new U1();
            }
        }

        return result;
    }
    public ArrayList loadU2(ArrayList<Item> itemList){

        U2 u=new U2();
        ArrayList<U2> result=new ArrayList<U2>();
        for (Item i: itemList){
            if (u.canCarry(i)){
                u.carry(i);

            }else{
                result.add(u);
                u=new U2();
            }
        }

        return result;
    }
    public int runSimulation(ArrayList<U1> rockets){
        int total=0;
        for (U1 u :rockets){
            //System.out.println(u.cost);
            while ( !(u.launch() &&u.land())){
                total+=u.cost;
            }
        }
        return total;
    }
}
