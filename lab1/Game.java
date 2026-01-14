package Java_practice.OOPS.lab1;
import java.util.Scanner;

class Player {
    String name;
    int health=50;
    int level=1;
    int hunger=100;//initial energy increases as the player eats something
    int stamina=100;//decrease if you attack someone
    int warmth=0;

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
        p.displayStatus();
    }
   
}

class Food {
    int Food =20;
    void consume(Player p){
        System.out.println("Player eats the food!");
        p.hunger=p.hunger - Food;
        p.displayStatus();
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
        System.out.println();

        //Display the stats of the new Player

        p1.displayStatus();

        //Part 1

        System.out.println("\nYou feel weak,The room is cold.\nYour body remembers hunger… and thirst.\nSomething lies nearby.");
        
        //Warmth

        System.out.println("\nYou see a firewood lying nearby! \nUsing a firewood would increase warmth by +20");
        Firewood warmth1 = new Firewood();
        System.out.println("Do you want to use firewood 1=yes ;0=no?");
        int in =sc.nextInt();
        sc.nextLine();
        if (in == 1) {
            warmth1.use(p1);
        }else if(in == 0){
            System.out.println("Warmth is not increased");
            p1.displayStatus();
        }else{
            System.out.println("Invalid input");
        }
        System.out.println();

        //Food 

        Food food1 = new Food();
        System.out.println("Do you want to eat food it reduces hunger bar by -20 1=yes;0=no?");
        int inf =sc.nextInt();
        sc.nextLine();
        if (inf==1) {
            food1.consume(p1);
        }else if (inf ==0) {
            System.out.println("If you dont consume food the hunger bar remains the same");
            p1.displayStatus();
        }
        else {
            System.out.println("Invalid input!!");
        }
        System.out.println();  
        
        sc.close();
    }
}
