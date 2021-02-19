import java.util.ArrayList;
import java.util.Random;

public class RandomArrayGenerator {
    private Random random;

    RandomArrayGenerator() {
    }

    public int[][] getArrays(int n) {
        int[][] arrayOfArrays = new int[n][];
        ArrayList<Integer> lengthsOfArrays = new ArrayList<Integer>();
        random = new Random();
        boolean isEven;

        // Ограничение на длины массивов создано сознательно,
        // чтобы избежать чрезмерно длительное время работы программы
        for (int length = 1; length <= n; length++) {
            lengthsOfArrays.add(length);
        }
        for (int i = 1; i <= n; i++) {
            int index = random.nextInt(lengthsOfArrays.size());
            int length = lengthsOfArrays.get(index);
            lengthsOfArrays.remove(index);
            int[] newArray= this.createArray(length);
            isEven = true;
            if(i % 2 != 0) {
                isEven = false;
            }
            newArray = this.sort(newArray, isEven);
            arrayOfArrays[i-1] = newArray;
        }

        return (arrayOfArrays);
    }

    public int[] createArray(int length) {
        int[] newArray = new int[length];
        for (int index = 0; index != newArray.length; index++) {
            newArray[index] = random.nextInt(100);
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