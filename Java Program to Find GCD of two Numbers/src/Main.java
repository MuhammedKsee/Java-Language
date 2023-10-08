public class Main {
    public static void main(String[] args) {

        int num1= 64, num2 = 14, gcd = 1, i;

        for(i = 1 ; num1>= i && num2>= i ; i++){

            if (num1 % i == 0 && num2 % i == 0){
                gcd = i;
            }

        }
        System.out.println("GCD of "+num1 + " and "+num2+" is "+ gcd);

    }
}