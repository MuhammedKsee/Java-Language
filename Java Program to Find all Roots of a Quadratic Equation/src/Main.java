public class Main {
    public static void main(String[] args){
        double a = 5, b = 4, c = 3;
        double det = b*b-4*a*c;
        double   root1,root2;
        if (det>0){
            root1 = (-b + Math.sqrt(det)) / (2*a);
            root2 = (-b - Math.sqrt(det)) / (2*a);
            System.out.format("root1 = %.2f and root 2 = %.2f",root1,root2);
        }
        else if (det == 0) {

            root1 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-det) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}