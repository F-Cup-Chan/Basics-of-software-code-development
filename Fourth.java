import java.util.Scanner;

public class Fourth {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите x");
        double x = a.nextDouble();
        double n = (int)(x);
        int d = (int) ((x%1)*1000);
        double c = n / 1000;
        System.out.println(c+d);
    }
}