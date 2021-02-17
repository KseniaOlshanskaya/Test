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
        for (int i = 1; i <= n; i++) {
            lengthOfArrays.add(i);
        }
        for (int i = 1; i < n; i++) {
            int index = random.nextInt(lengthOfArrays.size() - 1);
            int length = lengthOfArrays.get(index);
            lengthOfArrays.remove(index);
            int size = lengthOfArrays.size();
            int[] newArray= this.createArray(length);
            if(i % 2 == 0) {
                newArray = this.sortAscending(newArray);
            }
            else{
                newArray = this.sortDescending(newArray);
            }
            arrayOfArrays[i-1] = newArray;
        }
        return (arrayOfArrays);
    }

    public int[] sortAscending(int[] array) {
        boolean isSorted = true;
        int middle;
        while(isSorted) {
            isSorted = false;
            for(int index = 0; index < array.length - 1; index++) {
               if(array[index] > array[index + 1]) {
                   middle = array[index];
                   array[index] = array[index + 1];
                   array[index + 1] = middle;
                   isSorted = true;
               }
           }
        }
        return(array);
    }
    public int[] sortDescending(int[] array) {
        boolean isSorted = true;
        int middle;
        while(isSorted) {
            isSorted = false;
            for(int index = 0; index < array.length - 1; index++) {
                if(array[index] < array[index + 1]) {
                    middle = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = middle;
                    isSorted = true;
                }
            }
        }
        return(array);
    }

    public int[] createArray(int length) {
        int[] newArray = new int[length];
        for (int index = 0; index != newArray.length; index++) {
            newArray[index] = random.nextInt();
        }
        return(newArray);
    }
}
