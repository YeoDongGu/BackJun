package q2884;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(H!=0){
            if(M<45){
                System.out.println((H-1) + " " + (M-45+60));
            } else{
                System.out.println(H + " " + (M-45));
            }
        } else {
            if(M<45){
                System.out.println((H-1+24) + " " + (M-45+60));
            } else{
                System.out.println(H + " " + (M-45));
            }
        }

    }
}
