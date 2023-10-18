public class Main {
    public static void main(String[] args) {

        int num1 = 10;

        System.out.println("Sum of the numbers: "+recursive(num1));

    }

    public static int recursive(int num1){
    if (num1!=0){
        return num1+recursive(num1-1);
    }
    else return num1;
    }
}