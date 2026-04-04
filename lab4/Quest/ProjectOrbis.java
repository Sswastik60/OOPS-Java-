package Quest;
//Main ENVIRONMENT
abstract class Environment {
    String name;
    // abstract void affect(Entities e);
}

abstract class Entities extends Environment implements Move,Attack,takeDamage{
    int health = 100;
}

class Knight extends Entities implements Swimming,displayStats{
    int swim_check=0;
    @Override
    public void display_Stats(){
        System.out.println("Character type :Knight");
        System.out.println("Health :"+health);
    }
    @Override
    public void swimming(){
        System.out.println("Knight is swimming");
        swim_check=1;
    }
    @Override
    public void takedamage(){
        if (swim_check!=1) {
            health-=100; 
            System.out.println("The knight drowned"); 
        } 
            
    }

    void condition_check(){
        if (swim_check!=1) {
            takedamage();
        }
    }
    @Override
    public void move(){
        System.out.println("The Knight is moving");
    }
    @Override
    public void attack() {
        System.out.println("The Knight attacks ");
    }
    
}

class Archer extends Entities{
    @Override
    public void move(){
        System.out.println("The Archer is moving");
    }
    @Override
    public void attack() {
        System.out.println("The Archer attacks ");
    }
    @Override
    public void takedamage() {
        System.out.println("The Archer was attacked");
    }

}
    

 
//different interfaces / features
interface displayStats{
    void display_Stats();
}
interface Swimming{
    void swimming();
}
interface Burnable{
    void burnable();
}
interface Move{
    void move();
}
interface Fly{
    void fly();
}
interface Attack{
    void attack();
}
interface takeDamage{
    void takedamage();
}
interface Heal{
    void heal();
}


//differnt regions
// class WaterRegion extends Environment{

//     @Override
//     void affect(Entities e) {
//         // TODO Auto-generated method stub
//         if (e.swimming()){
//             System.out.println("The entity is swimming =>he survies the water region");
//         }else{
//             e.takedamage();
//         }
//     }
    
// }

// class FireRegion extends Environment{

//     @Override
//     void affect(Entities e) {
//         // TODO Auto-generated method stub
//         if (e.burnable()) {
//             System.out.println("The entity has a burnable =>he survives the fire region");
//         }else{
//             e.takedamage();
//         }
//     }
    
// }

//main class
public class ProjectOrbis {
    public static void main(String[] args) {
    Knight Steve = new Knight();
    Steve.move();
    // Steve.swimming();
    Steve.condition_check();
    Steve.display_Stats();
    }
    

}
