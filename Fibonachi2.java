import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        int f = 1;
        int s = 2;
        if (number == 1){
            System.out.println(1);
        }
        else if (number == 2) {
            System.out.println(2);
        }
        else {
            for (int i = 3; i <= number; i++){
                result = f + s;
                f = s;
                s = result;
            }
            System.out.println(result);
        }
    }
}
