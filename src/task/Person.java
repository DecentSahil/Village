package task;



public class Person {
    private String name;
    private  int age;
    private int salary;
    private final String gender;
    private String document;
//    private List<List<Object>> personDetails;
//     individualDetails;
Person(String name,int age,int salary,String gender){
    this.name = name;
    this.age = age;
    this.salary = salary;
    this.gender = gender;
}Person(String name,int age,int salary,String gender,String document){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.document = document;
    }
    public String toString() {
        if(document==null){
            return name+"\nPlease Provide document";
        }
        String checkTax = "";
        String ageGroup = "";
        if (salary>=50000) {
            checkTax = "(taxable)";
        }
        else {
            checkTax = "(Not taxable)";
        }
        if(age<18 ){
            ageGroup = "(Minor)";
        } else if (age<60) {
            ageGroup = "(Adult)";
        } else if (age<=100) {
            ageGroup = "(Senior Citizen)";
        }
        else{
            ageGroup = "Invalid Input";
        }
        return "Name : "+name +"\nGender : "+gender+"\nDocument submitted : " +document+"\nAge : " + age + ageGroup+" \nSalary : "+ salary + checkTax+"\n";


    }

}
