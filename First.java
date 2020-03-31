import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите a, b, c");
        int x = a.nextInt();
        int y = a.nextInt();
        int t = a.nextInt();
        int z = (x - 3)*y/2+t;
        System.out.println(z);
    }
}
