package Java_practice.OOPS.lab1;
import java.util.Scanner;

class Player {
    String name;
    int health=100;
    int level=1;

    void displayStatus(){
        System.out.println("Name:"+name);
        System.out.println("Health:"+health);
        System.out.println("Level:"+level);
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
    }
}
