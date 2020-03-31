import java.util.Scanner;

public class Second {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите a, b, c");
        double x = a.nextDouble();
        double y = a.nextDouble();
        double t = a.nextDouble();
        double z = ((y + Math.sqrt(Math.pow(y, 2)+4*x*t))/(2*x))-Math.pow(x, 3)*t+Math.pow(y, -2);
        System.out.println(z);
    }
}
