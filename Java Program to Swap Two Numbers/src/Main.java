public class Main {
    public static void main (String[] args)
    {
        int num1 = 54;
        int num2 = 3453;
        System.out.println("Number 1 : "+num1);
        System.out.println("Number 2 : "+num2);

        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Swapped Number 1 : "+num1);
        System.out.println("Swapped Number 2 : "+num2);
    }
}