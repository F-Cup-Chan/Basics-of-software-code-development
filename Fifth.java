import java.util.Scanner;

public class Fifth {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите время в секундах");
        int x = a.nextInt();
        int HH = (x/3600);
        int MM = ((x-HH*3600)/60);
        int SS = x - HH*3600-MM*60;
        System.out.println(HH + "ч " + MM + "м " + SS + "с");
    }
}
