class Employee{
    int id;
    int salary;
    String name;
    public void printdetails(){
        System.out.println("my id is "+id);
        System.out.println("my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee binod=new Employee();//a new employee object
        Employee ankit=new Employee();

        //setting attribute for binod
        binod.id=11;
        binod.name="Binod Joshi";
        binod.salary=12000;

        //setting attribute for ankit
        ankit.id=12;
        ankit.name="ankit Joshi";
        ankit.salary=12000;

        ankit.printdetails();
        binod.printdetails();
        int salary =binod.getSalary();
        System.out.println(salary);

    }
}
