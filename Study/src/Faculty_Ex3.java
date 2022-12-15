
class Person_Ex3 {

    public Person_Ex3() {
        System.out.println("here");
    }

    //public Person_Ex3(String s){
       // System.out.println(s);
    //}
}

class Employee_Ex3 extends Person_Ex3 {

    public Employee_Ex3() {
        this("Invoke Employee's overloaded constructor");
        System.out.println("Performs Employee's tasks");
    }

    public Employee_Ex3(String s) {
        //implicit super() - because there is no non-default constructor in the
        //superclass, only superclasses no-arg constructor can be invoked
        System.out.println(s);
    }
}

public class Faculty_Ex3 extends Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //new Faculty_Ex2();
        new Faculty_Ex3("faculty member 5");
    }

    public Faculty_Ex3() {
        System.out.println("Performs Faculty's tasks");
    }

    public Faculty_Ex3(String s) {
        //explicitly invokes superclasses non-default constructor
        super(s);
        System.out.println(s);
    }

}