class Employee{
    private int id;
    private String name;
    private double salary;
    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        if(id>0){
            this.id=id;
        }
        else{
            System.out.println("Invalid Id.");
        }
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if(name!=null&&!name.isEmpty()){
            this.name=name;
        }
        else{
            System.out.println("Invalid name.");
        }
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(double salary){
        if(this.salary>0){
            this.salary=salary;
        }
        else{
            System.out.println("Invalid salary.");
        }
    }
    public void Display(){
        System.out.println("Id : "+id+" Name : "+name+" Salary : "+salary);
    }
}


public class Details{
    public static void main(String args[]){
        Employee emp=new Employee(101,"Deepan",150000);
        Employee emp2=new Employee(102,"Hari",180000);
        System.out.println("Name of the Employee : "+emp.getName());
        System.out.println("Salary : "+emp.getSalary());
        emp.Display();
    }
}
