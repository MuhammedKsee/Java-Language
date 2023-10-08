public class Main {
    public static void main (String[] args){

        char ch = 'a';
        int ascii = ch;

        if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <=122){
            System.out.println(ch + " is a alphabet");
        }
        else {
            System.out.println(ch + " is not a alphabet");
        }

    }
}