public class Main {
    public static void main(String[] args) {

        int num1 = 6;

        System.out.println("Factorial:"+factorial(num1));

    }
    public static int factorial(int num1){

        if (num1>1){
            return  num1*factorial(num1-1);
        }
        else return num1;
    }
}