public class Main {
    public static void main(String[] args){
        int num1= 91, i, count = 0;

        for (i=num1;i>0;i--){
         if (num1%i==0){
             count++;
         }
        }
        if (count>2){
            System.out.println("This number is not a prime number");
        }
        else{
            System.out.println("This number is a prime number");
        }
    }
}