package Java_practice.OOPS.Quest2;

import java.util.Scanner;

public class Fifthgate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        int events = sc.nextInt();
        int sum=0;
        for (int i = 1; i <= events; i++) {
            int severity = (seed * i + 7) % 10;
            sum+=severity;
            if (severity>=9) {
                System.out.println("LOCKDOWN AT EVENT "+ i);  
                break;
            }
            else if ((sum/events)>=6 && i==events) {
                System.out.println("CONTAINMENT");
                break;
            }
            else if (i==events){
                System.out.println("RELEASE");
                break;
            }
        }
        sc.close();

    }
}
