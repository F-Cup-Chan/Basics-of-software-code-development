import java.util.Scanner;

public class Eighth {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите a, b, c, d");
        double x = a.nextDouble();
        double y = a.nextDouble();
        double z = a.nextDouble();
        double c = a.nextDouble();
        double q = Math.min(x, y);
        double w = Math.min(z, c);
        double e = Math.max(q, w);
        System.out.println(e);
    }
}
