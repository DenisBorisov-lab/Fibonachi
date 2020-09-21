package PiNumber;

import java.util.Scanner;

public class Fibonachi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int f = 1;
        int s = 2;
        int result = 0;
        if((number == 1) || (number == 2)){
            System.out.println(1);
        }else{
            for (int i = 3; i <= number; i++){
                result = f + s;
                f = s;
                s = result;
            }
            System.out.println(result);
        }

    }
}
