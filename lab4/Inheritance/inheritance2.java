package Inheritance;
//multiple inheritance not allowed in java
abstract class character{//now we cannot create objects of this abstract class.
    String name;
    // abstract void attack1(){
    //     System.out.println("This ensures there should be a attack1 method in every child class");
    // }WE CANT CREATE AN OBJECT OF character AND THERE SHOULD BE attack1 method in each child class ponly abstract classes can have abstract methods because if abstract class is not there we might create a character object and try to run the abstract method which is not possible.
    void attack(character c){
        System.out.println("Attacked");
    }
    
}

//INTERFACE we can implement n number of interfaces but there is only one class that can extended.

interface flyable{
    int max_ht=100000; //final keyword it becomes a constant and we cant change the value (will be public, static and final)

    default void fly(){

    }
    default void land(){

    }

    //to write code inside the interface we have to use the keyword default
    default void fly1(){

    }
}
//child can call father not grandfather branch to access grand father from the child class we have to call it step wise

class mage extends character implements flyable{//the interface methods should be in this class
    int magicpower;
    

    String n = super.name;//to access data from the super class similarily any methods or functions can also be called including the static variables also using the super.() 
    @Override // (not mandatory but used to make the code more reliable)it doesnt matter even if we dont use it bbut if we still write it to make sure the function operates correctly
    void attack(character c){
        System.out.println("Abracadabra");
    }
    void castspell(character c){
        System.out.println("wingardium laviosa");
    }
    //this wont work if cast spell is called for it to work there should be a cast spell function ijn the character super class

}

class knight extends character{
    int strength;

    void attack(character c){
        System.out.println("Thunder bolt");
    }
}

public class inheritance2 {
    public static void main(String[] args) {
        // character c = new character();this is not possible if the class is an abstract class
        character hero= new knight();
        character villain = new mage();
        hero.attack(villain);
        villain.attack(hero);
        ((mage)villain).castspell(hero);//this will be not allowed
        if (hero instanceof knight) {
            System.out.println("hero instance of knight");
        }
        //for cast spell to work we have to use EXPLICIT CONVERSION TO THE MAGE TYPE
        //runtime error ((mage)hero).castspell(villain); hero of type knight
        
        // character c1 = new character();XXXXXXXX   //logically useless can create bugs to prevent that we make it an ABSTRACT CLASS
    }
    
}
