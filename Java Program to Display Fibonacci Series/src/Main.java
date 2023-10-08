public class Main {
    public static void main(String[] args) {

        int firstTerm = 0 , secondTerm = 1 , nextTerm , i;
        System.out.print("Fibonacci Series : "+firstTerm);
        for (i = 0;i<10;i++){
            System.out.print(" "+secondTerm);
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }

    }
}