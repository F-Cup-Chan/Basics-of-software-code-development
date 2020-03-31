import java.util.Scanner;

public class Third {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите x, y");
        double x = a.nextDouble();
        double y = a.nextDouble();
        double z = (Math.sin(x)+Math.cos(y)/(Math.cos(x)-Math.sin(y)))*Math.tan(x*y);
        System.out.println(z);
    }
}
