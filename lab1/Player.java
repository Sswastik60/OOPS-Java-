package Java_practice.OOPS.lab1;
import java.util.Scanner;

public class Player {
    String name;
    int health=100;
    int level=1;
    int hunger=10;//initial energy increases as the player eats something
    int stamina=100;//decrease if you attack someone

    void displayStatus(){
        System.out.println("Name:"+name);
        System.out.println("Health:"+health);
        System.out.println("Level:"+level);
    }

}

class Firewood {
    int warmth =20;
    void use(Player p){
        System.out.println("Player used Firewood!");
        p.health=p.health + warmth;
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

        System.out.println("You see a firewood lying nearby!");
        warmth warmth1 = new Firewood();
    }
}
