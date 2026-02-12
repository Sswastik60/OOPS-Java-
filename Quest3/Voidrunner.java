package Quest3;

class Pilots{
    int exp=0;

}

class Shuttles{
    int fuel;
    int reserve;
    int journey;//0 for not started 1 for mid way 2 for completed
    void verifyfuel(){
        if (fuel+reserve==100) {
            System.out.println("Shuttle is ready for exploration");
        }
        else if ((fuel + reserve == 0 ) && (journey == 1)) {
            System.out.println("Alert!!! Need emergency refueling");
        }
    }
}

class Equipments{//Array of object of elements using that for loop method 
    
    void currequipment(){

    }
}


public class Voidrunner {
    public static void main(String[] args) {
        Equipments[] eqplist = new Equipments[3];
        for (int i = 0; i < eqplist.length; i++) {
            eqplist[i]=new Equipments();
        } 
    }
    
}