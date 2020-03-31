import java.util.Scanner;

public class Sixteenth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов числового ряда, е");
        double sum = 0;
        int am = scanner.nextInt();
        double e = scanner.nextDouble();
        for (int i = 1; i <= am; i++){
            double member = 1 / Math.pow(2,i) + 1 / Math.pow(3,i);
            if (Math.abs(member) >= e) sum += member;
        }
        System.out.println(sum);
    }
}
