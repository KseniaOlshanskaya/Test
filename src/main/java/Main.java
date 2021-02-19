import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number n: ");
        try {
            int n = in.nextInt();
            RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator();
            int[][] arrays = randomArrayGenerator.getArrays(n);

            for (int[] array : arrays) {
                System.out.println(Arrays.toString(array));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        in.close();
    }
}