public class Main {
    public static void main(String[] args){

        int num1= 1234, reverse = 0, digit;

        while (num1!=0){
            digit=num1%10;
            reverse = reverse * 10 + digit;
            num1/=10;
        }
        System.out.println(reverse);

    }
}