import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Введите a, b, h");
        double a = x.nextDouble();
        double b = x.nextDouble();
        int h = x.nextInt();
        double i = a;
        while (i <= b){
            if (i > 2) System.out.println(i);
            else System.out.println(-i);
            i = i + h;
        }
    }
}
