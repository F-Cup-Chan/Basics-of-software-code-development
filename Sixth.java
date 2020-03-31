import java.util.Scanner;

public class Sixth {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите x, y");
        double x = a.nextDouble();
        double y = a.nextDouble();
        if (x <= 2 && x >= -2 && y <= 4 && y >= 0)
            System.out.println("true");
        else if (x <= 4 && x >= -4 && y <= 0 && y >= -3)
            System.out.println("true");
        else System.out.println("false");
    }
}