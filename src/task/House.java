package task;
import java.util.List;
import java.util.ArrayList;

public class House {
    private String houseType;
    private Double houseArea;
    List<Person> persons;
    private int houseNumber;
    House(int houseNumber,String houseType,Double houseArea){
        this.houseNumber = houseNumber;
        this.houseType = houseType;
        this.houseArea = houseArea;
        persons = new ArrayList<>();
    }
    public void addPerson(Person person){
        persons.add(person);
    }
    public void noOfMember(){
        System.out.println("no of member in house is:"+persons.size());
    }
    public void GetDetails(){
        System.out.println("details of house : "+houseNumber);
        for(Person details: persons){
            System.out.println(details);
        }
        System.out.println();

    }
    public String toString(){
        return "House Number : "+houseNumber+"\nHouseType : "+houseType+"\nHouseArea : " +houseArea+"\n";
    }
}
