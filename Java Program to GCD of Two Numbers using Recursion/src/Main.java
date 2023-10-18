public class Main {
    public static void main(String[] args) {

    int num1=366,num2=60;

        System.out.println("GCD of "+num1+" and "+num2+" is : "+GCD(num1,num2));
    }
    public static int GCD(int num1,int num2){
        if (num2 != 0)
            return GCD(num2, num1 % num2);
        else
            return num1;
    }
}