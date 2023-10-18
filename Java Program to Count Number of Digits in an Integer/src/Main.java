public class Main {
    public static void main(String[] args){

        int num1 = 32332434, count = 0;

        while   (num1>1){
            num1/=10;
            count++;
        }
        System.out.println(count);
    }
}