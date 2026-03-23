package Quest3;

import java.util.Scanner;

class Pilot {
    Scanner sc = new Scanner(System.in);
    String name;
    int exp;  
    boolean status;

    Pilot(String name,int exp){
        this.name=name;
        this.exp = exp;
    }

    void pilotmenu(){
        System.out.println("-----CONTROL MENU-----\n1.Register new pilots.\n2.Veteran pilot login menu\n3.Add shuttle\n4.Pair Pilot with shuttle\n5.Assign standard mission\n6.Assign higher difficulthy missions\n7.Review status of pilots,shuttles and fuel reserves\n\nEnter your option:");
        int n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter pilot name:");
                name=sc.nextLine();
                System.out.println("Enter experience:");
                n=sc.nextInt();
                Pilot p = new Pilot(name, n);
                
                break;
        
            default:
                break;
        }


    }
}

class Shuttles{
    String name;
    int fuel;
    int distance_to_travel;
    String[] equipments={"Radar","Extractor","Sonar","Rover","Camera"};

    Shuttles(String name,int fuel,int distance_to_travel){
        this.name=name;
        this.fuel=fuel;
        this.distance_to_travel=distance_to_travel;
    }

    int reqfuel(int distance){
        return distance*5;//considering 1km distance requires 5 litre fuel.
    }

    void verifyfuel(Shuttles s){
        System.out.println("Fuel in :"+s.name+"="+s.fuel);
        if (s.fuel <= reqfuel(s.distance_to_travel)) {
            System.out.println("Fuel less than required fuel.\nPlease refuel before leaving on the mission!!");
        }

    }
}

public class Missioncontrol {
    public static void main(String[] args) {
        
    }
    
}

