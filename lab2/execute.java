class player{
    int health = 100;
    int strength =20;
    // public void attack(player p){


    // }
}

class mage extends player{
    int health = 120;
    int magic=50;
}
// concept of inheritance
public class execute{
    public static void main(String[] args){
        mage m=new mage();//object is mage but still the type is player that is why it gives 100 instead of 120
        System.out.println(m.health);//prints the health of the player instead of mage
        // mage k = new player(); this cant be done as mage is subclass  of player
        System.out.println(m.strength);
        System.out.println(m.magic);//cant do this cause type is player according to the compiler so it checks in the player class instead of mage


    }
}