package task;

import java.util.ArrayList;
import java.util.List;

public class Details {
    public static void main(String[] args) {
        List<Village> villageList = new ArrayList<>();
        Person p1 = new Person("Dugg" +
                "",4,34000,"male");
        Person p2 = new Person("Ritik",23,94000,"male","aadhar Card");
        Person p3 = new Person("Sahil",19,30000,"male","Voter id card");
        Person p4 = new Person("Prashant",40,120000,"male","pan card");
        Person p5 = new Person("Aman",230,33000,"male");
        Person p6 = new Person("Ankit",98,40000,"male");

        House h1=new House(1,"Kachha House",45.06);

        House h2 = new House(2,"Pucca house",23.89);
        h1.addPerson(p2);
        h1.addPerson(p1);
        h1.addPerson(p3);
        h1.addPerson(p4);
        h1.addPerson(p5);
        h1.addPerson(p6);
        h1.noOfMember();
        h1.GetDetails();
        Village gopalpur = new Village();
        villageList.add(gopalpur);
        gopalpur.addHouse(h1);
        gopalpur.addHouse(h2);
        gopalpur.noOfHouse();
    }
}
