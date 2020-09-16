import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int zero = 0;
        int one = 1;

        int wer = binary.length();
        
        for (int k = wer -1; k >= 0; k--){

            if (binary.charAt(k)=='1'){

                zero += one;
            }
            one = one*2;
        }
        return zero;


    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format:");
        String binary = scan.next();
        System.out.println("That is equal to the decimal value: "+ binaryToDecimal(binary));


    }
}
