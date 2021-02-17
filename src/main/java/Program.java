import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static int[][] arrayOfArrays;
    public static ArrayList<Integer> lengthOfArrays;
    public static Random random = new Random();

    Program() {
    }

    public int[][] getArrays(int n) {
        arrayOfArrays = new int[n][];
        lengthOfArrays = new ArrayList<Integer>();
        boolean isEven;
        for (int i = 1; i <= n; i++) {
            lengthOfArrays.add(i);
        }
        for (int i = 1; i < n; i++) {
            int index = random.nextInt(lengthOfArrays.size() - 1);
            int length = lengthOfArrays.get(index);
            lengthOfArrays.remove(index);
            int size = lengthOfArrays.size();
            int[] newArray= this.createArray(length);
            isEven = true;
            if(i % 2 != 0) {
                isEven = false;
            }
            this.sort(newArray, isEven);
            arrayOfArrays[i-1] = newArray;
        }
        return (arrayOfArrays);
    }

    public int[] createArray(int length) {
        int[] newArray = new int[length];
        for (int index = 0; index != newArray.length; index++) {
            newArray[index] = random.nextInt();
        }
        return(newArray);
    }
    public int[] sort(int[] array, boolean isEven) {
        boolean isSorted = true;
        int middle;
        while(isSorted) {
            isSorted = false;
            for(int index = 0; index < array.length - 1; index++) {
                if(array[index] < array[index + 1] & !isEven) {
                    middle = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = middle;
                    isSorted = true;
                }
                if(array[index] > array[index + 1] & isEven) {
                    middle = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = middle;
                    isSorted = true;
                }
            }
        }
        return(array);
    }
}
