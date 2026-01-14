package Java_practice.OOPS.lab1;
import java.util.Scanner;

class Player {
    String name;
    int health=100;
    int level=1;
    int hunger=10;//initial energy increases as the player eats something
    int stamina=100;//decrease if you attack someone
    int warmth=50;

    void displayStatus(){
        System.out.println("Name:"+name);
        System.out.println("Health:"+health);
        System.out.println("Level:"+level);
        System.out.println("Hunger:"+hunger);
        System.out.println("Stamina:"+stamina);
        System.out.println("Warmth:"+warmth);
    }

}

class Firewood {
    int warmth =20;
    void use(Player p){
        System.out.println("Player used Firewood!");
        p.warmth=p.warmth + warmth;
    }
   
}

public class Game {

    public static void main(String[] args) {
        
        System.out.println("You wake up in a dark room.");
        System.out.println("Your name echoes in the void...");
        //Name input 
        Scanner sc = new Scanner(System.in);
        Player p1 = new Player();
        System.out.println("Enter Player Name: ");
        p1.name = sc.nextLine();

        //Display the stats of the new Player
        p1.displayStatus();

        System.out.println("You feel weak,The room is cold.\nYour body remembers hunger… and thirst.\nSomething lies nearby.");

        System.out.println("You see a firewood lying nearby! \nUsing a firewood would increase warmth by +20");
        Firewood warmth1 = new Firewood();
        System.out.println("Do you want to use firewood 1=yes ;0=no?");
        int in =sc.nextInt();
        if (in == 1) {
            warmth1.use(p1);
            p1.displayStatus();
            // System.out.println("inside if");
        }



           
    }
}
