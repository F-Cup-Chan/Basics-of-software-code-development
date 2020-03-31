import java.util.Scanner;

public class Twelfth {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.println("Введите число");
        int A = q.nextInt();
        int sum = 0;
        if (A > 0){
            for (int i = 1; i <= A; i++){
                sum += i;
            }
            System.out.println("Сумма равна " + sum);
        }
    }
}