public class Main {
    public static void main(String[] args){

        int num1= 64 , num2 = 14 , i , lcm;

        lcm = (num1 > num2) ? num1 : num2;

        while (true) {
            if (lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.printf("The LCM of %d and %d is %d.", num1, num2, lcm);
                break;
            }
            lcm++;
        }
    }
}