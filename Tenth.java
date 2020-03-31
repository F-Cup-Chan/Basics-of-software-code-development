import java.util.Scanner;

public class Tenth {
    public static void main(String[] args){
        Scanner q = new Scanner(System.in);
        System.out.println("Введите A, B, x, y, z");
        double A = q.nextDouble();
        double B = q.nextDouble();
        double x = q.nextDouble();
        double y = q.nextDouble();
        double z = q.nextDouble();
        if (x == Math.min(x, y)){
            double Min1 = x;
            double Min2 = Math.min(z, y);
            Tenth.equal(A, B, Min1, Min2);
        }
        else {
            double Min1 = y;
            double Min2 = Math.min(x, z);
            Tenth.equal(A, B, Min1, Min2);
        }
    }
    static void equal(double a, double b, double x, double y){      //принимает значения в формате высота отверстия, ширина отверстия, минимальное значение 1 и 2
        if (x < a && y < b) System.out.println("влезет");
        else if (y < a && x < b) System.out.println("влезет");
        else System.out.println("не влезет");
    }
}
