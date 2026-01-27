package Java_practice.OOPS.lab3;

public class objreturnfroommethod {

    public static void main(String[] args) {
        Player Hero = new Player();
        Player Villain = dummyPlayer(Hero);

        System.out.println("Hero health: " + Hero.health);
        System.out.println("Villain health: " + Villain.health);
    }

    public static Player dummyPlayer(Player temp) {//returns a change in the reference 
        temp.health = 1000;   // affects Hero
        Player dummy = new Player();
        dummy.health = temp.health + 50;
        return dummy;
    }

    static class Player {
        int health = 100;
    }
}
//pass an object to a method and return an object from the method uses pass by reference due to which any change changes the real values also(PASS BY REFERENCE)
