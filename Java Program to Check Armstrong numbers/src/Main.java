public class Main {
    public static void main(String[] args){

        int num = 153,num1,result=0,remainder;
        num1=num;
        while(num1!=0){
            remainder=num1%10;
            result += Math.pow(remainder,3);
            num1/=10;
        }
        if (result == num)
        System.out.println(result+" is a armstrong number.");

    }
}