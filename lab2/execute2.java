 class player {
    int health=100;
    int strength =100;
    public void attack(player p){
        p.health=p.health-1;
    }
        
}
 class mage extends player {
    public void attack(player p){
        p.health=p.health-10;
    }
    
}
 class knight extends player{
    public void attack(player p){
        p.health=p.health-20;
    }
    
}




//same method name but returning different method = "Polymorphism"
// till what level we can make the code visible and accesssible is known as ="Abstraction"
public class execute2 {
    public static void main(String[] args) {
        
        player p1 =new player();
        mage m1 =new mage();
        knight k1 =new knight();
        p1.attack(m1);
        k1.attack(m1);

    }
}
