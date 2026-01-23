package Java_practice.OOPS.Quest2;

import java.util.Scanner;

public class Fifthgate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seed = sc.nextInt();
        int events = sc.nextInt();
        int avg=
        for (int i = 0; i < events; i++) {
            int severity = (seed * i + 7) % 10;
            if (severity>=6) {
                System.out.println("CONTAINMENT");
                break;
            }
            else if (severity>=9) {
                System.out.println("LOCKDOWN AT EVENT "+ i);
            }
            else{
                System.out.println("RELEASE");
            }
        }

    }
}
