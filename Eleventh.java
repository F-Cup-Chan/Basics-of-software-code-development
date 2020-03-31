import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Введите число");
        double A = q.nextInt();
        if (A >= 3){
            double x = Math.pow(A, 2) - 3*A + 9;
            System.out.println("F(x)= " + x);
        }
        else if (A < 3){
            double x = 1/(Math.pow(A, 3)+6);
            System.out.println("F(x)= " + x);
        }
    }
}
