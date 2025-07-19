package task;

import java.util.ArrayList;
import java.util.List;

public class Village{
    List<House> houses ;
    Village(){
        houses = new ArrayList<>();
    }
    public void addHouse(House houseNumber){
        houses.add(houseNumber);
    }

    public void GetDetails(){
        for(House details: houses){
            System.out.println(details);
        }
        System.out.println();

    }
    public void noOfHouse(){
        System.out.println("No of house in village:"+houses.size());
    }
    public void noOfStreetLight(){
        System.out.println();
    }
    public void noOfVehicle(){
        System.out.println();
    }
}

