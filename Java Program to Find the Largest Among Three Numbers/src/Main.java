public class Main {
    public static void main (String[] args){
        int num1 = 43, num2 = 54, num3 = 65;

        if (num1 > num2 && num1 > num2){
            System.out.println(num1+" is Largest Among");
        }
        else if(num2>num1&&num2>num3){
            System.out.println(num2+" is Largest Among");
        }
        else {
            System.out.println(num3+" is Largest Among");
        }
    }
}