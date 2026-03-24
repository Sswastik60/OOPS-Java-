abstract class character{//now we cannot create objects of this abstract class.
    String name;
    void attack(character c){
        System.out.println("Attacked");
    }
    
}

class mage extends character{
    int magicpower;
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
        character hero= new knight();
        character villain = new mage();
        hero.attack(villain);
        villain.attack(hero);
        ((mage)villain).castspell(hero);//this will be not allowed
        //for cast spell to work we have to use EXPLICIT CONVERSION TO THE MAGE TYPE
        //runtime error ((mage)hero).castspell(villain); hero of type knight
        
        // character c1 = new character();XXXXXXXX   //logically useless can create bugs to prevent that we make it an ABSTRACT CLASS
    }
    
}
