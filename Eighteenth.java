import java.util.Scanner;

public class Eighteenth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите m, n");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for(int i = m; i <=n; i++){
            System.out.print("Делители числа " + i + " ");
            for (int q = 2; q < i; q++){
                if (i%q == 0) System.out.print(q + " ");
            }
            System.out.println();
        }
    }
}
