import java.util.Scanner;

public class Nineteenth {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите числа");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Nineteenth.calc(x);
        Nineteenth.calc(y);
    }
    static void calc (int a){
        String string = String.valueOf(a);
        int a1 = string.length();
        for (int i = 0; i < a1; i++) {
            System.out.print(string.substring(i, i+1) + " ");  //выводит цифру числа с начальной координатой i и конечной координатой i+1
        }
        System.out.println();
    }
}
