public class Main {
    public static void main(String[] args){


        factorsOfNumber(60);

    }

    static int factorsOfNumber(int number){

        for (int i = 1; i <number; i++) {
            if (number%i==0)
            System.out.println(i);
            else {
            }
        }

        return 0;
    }

}