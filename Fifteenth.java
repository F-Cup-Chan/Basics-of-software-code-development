public class Fifteenth {
    public static void main(String[] args){
        long sum = 1;
        for (int i = 10; i <=200; i++){
            sum = (long) (Math.pow(i, 2) * sum);
        }
        System.out.println(sum);
    }
}
