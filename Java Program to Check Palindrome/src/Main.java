public  class Main {
    public static void main(String[] args){

        int num1 = 3456643,reverse,temp=0,fix=0;
        temp = num1 ;
        while (num1>1){

            reverse = num1%10;
            fix = fix*10+reverse;
            num1/=10;
        }
        if (fix == temp){
            System.out.println("This Number is a palindrome");
        }
        else {
            System.out.println("This Number is not a palindrome");
        }
    }
}