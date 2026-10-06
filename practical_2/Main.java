/*
name : Reuel Bodhak
PRN NO : 32658010086
DIV : C
*/

class Employee {
    String name,position;
    int id;
    double salary;

    public Employee(String name,String position,int id,double salary){
        this.name = name;
        this.position = position;
        this.id = id;
        this.salary = salary;
    }

    void display(){
        System.out.println("============== Employee Details =================");
        System.out.println("Name : " + name);
        System.out.println("Position : " + position);
        System.out.println("Employee ID : " + id);
        System.out.println("Salary : " + salary);
        System.out.println("=================================================");
    }
}

public class Main {
    public static void main(String args[]){
        Employee emp = new Employee("Avdhut","Manager",12433,1000000.00);
        emp.display();
    }
}