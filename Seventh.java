import java.util.Scanner;

public class Seventh {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите x, y");
        double x = a.nextDouble();
        double y = a.nextDouble();
        if (x+y<180)
            if (x==90 || y == 90 || (180 - x - y)==90 ) System.out.println("прямоугольный треугольник");
            else System.out.println("существует");
        else System.out.println("не существует");
    }
}
