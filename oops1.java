package dteaching;

class Employee{
    int salary;
    String name ;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    int getSalary(){
        return salary;
    }
    void setSalary(int salary){
        this.salary= salary;
    }
}
public class oops1 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("Diksha");
        System.out.println(e1.getName());
        e1.setSalary(500);
        System.out.println(e1.getSalary());
    }
}
