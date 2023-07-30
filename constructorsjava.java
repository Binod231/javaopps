class EmployeeSalary{
    private  long salary;
    private String name;
    public EmployeeSalary(String empName,long empSalary){
        salary=empSalary;
        name=empName;

    }
    public EmployeeSalary(){
        salary=10000;
        name="Yogesh";
    }
    public  EmployeeSalary(String empName){
        salary=40000;
        name=empName;
    }


    public long getSalary(){
        return salary;
    }
    public String getName()
    {
        return name;
    }
}

public class constructorsjava {
    public static void main(String[] args) {
        EmployeeSalary ss=new EmployeeSalary("Ankit",20000);
        System.out.print("Name: ");
        System.out.println("\t\tSalary: ");
        System.out.print(ss.getName());
        System.out.println("\t\t" + ss.getSalary());

    }

}
