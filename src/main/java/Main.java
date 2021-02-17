import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number n: ");
        int n = in.nextInt();
        Program program = new Program();
        int[][] arrays = program.getArrays(n);

        in.close();
    }
}
