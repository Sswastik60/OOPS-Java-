package Inheritance;
class Student{
    protected double total;
    String name;
    double m1;
    double m2;
    double m3;
    Student(String name,double a,double b,double c){
        this.name=name;
        this.m1=a;
        this.m2=b;
        this.m3=c;
    }

    void display(){
        System.out.println("---STUDENT REPORT---");
        System.out.println("NAME:"+this.name+"\nMarks1:"+m1);
    }  
}

class Sciencestudent extends Student {

    Sciencestudent(String name, double a, double b, double c) {
        super(name, a, b, c);//whenever the child class constructor is called it runs the super ckass constructor
        //TODO Auto-generated constructor stub
    } 

    void compute(){
        this.total=m1+m2+m3;
    } 
    
}

class Artstudent extends Student {
    
    Artstudent(String name,double a,double b,double c,String sub){
        super(name,a,b,c);
    }

    void display(){
        System.out.println("----Art student Report----");
    }
    
}
public class inheritance1 {


    public static void main(String[] args) {
        Student[] students = new Student[5];
        
        students[0]=new Sciencestudent("Swastik", 0, 0, 0);//this can be used to assign a particular function to a subclass or child class
        Student s1;//this happens in the stack memory
        s1 = new Sciencestudent(null, 0, 0, 0);//constructor without parameter then the super class constructor will be called if no parameter was given in the constructor
        ((Sciencestudent)s1).compute();//can be used if we want to use a method that is inside the child class 
        s1.display();//this calls the display function from the science students display method

        s1= new Artstudent(null, 0, 0, 0, null);
        s1.display();//this works during the compile time and hence this s1.display() will call the display function in the Artstudent child class.
//      THIS IS KNOW AS DYNAMIC OVERLOADING


    }

}

