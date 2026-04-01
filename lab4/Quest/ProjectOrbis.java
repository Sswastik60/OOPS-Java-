package Quest;
//Main ENVIRONMENT
abstract class Environment {
    String name;
    // abstract void affect(Entities e);
}

abstract class Entities extends Environment implements Move,Attack,takeDamage{
    int health = 100;
}

class Knight extends Entities{
    @Override
    public void move(){
        System.out.println("The Knight is moving");
    }
    @Override
    public void attack() {
        System.out.println("The Knight attacks ");
    }
    @Override
    public void takedamage() {
        System.out.println("The Knight was attacked");
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
    
}
