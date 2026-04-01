package Quest;
//Main ENVIRONMENT
abstract class Environment {
    String name;
    abstract void affect(Entities e);
}

abstract class Entities extends Environment implements Swimming,Burnable,Move,Fly,Attack,takeDamage,Heal{
    int health = 100;
}

 
//different interfaces / features
interface Swimming{
    boolean swimming();
}
interface Burnable{
    boolean burnable();
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
class WaterRegion extends Environment{

    @Override
    void affect(Entities e) {
        // TODO Auto-generated method stub
        if (e.swimming()){
            System.out.println("The entity is swimming =>he survies the water region");
        }else{
            e.health-=10;
        }
    }
    
}

class FireRegion extends Environment{

    @Override
    void affect(Entities e) {
        // TODO Auto-generated method stub
        if (e.burnable()) {
            System.out.println("The entity has a burnable =>he survives the fire region");
        }
    }
    
}

//main class
public class ProjectOrbis {
    
}
