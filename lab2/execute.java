class player{
    int health = 100;
}

class mage extends player{
    int health = 120;
}

public class execute{
    public static void main(String[] args){
        player m=new mage();
        System.out.println(m.health);//prints the health of the player instead of mage


    }
}