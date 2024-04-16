
public class Task {
    public static void main(String[] args) {
        int[] firstArray = {1007, 7, 6, 9, 12, 10, 11};
        int[] secondArray = {-11, 21, 101, 91, -11, 51, 41, 61, 41};
        int[] result = inverseArray(firstArray, secondArray);
        System.out.print("[");
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print(result[result.length - 1] + "]");
    }

    public static int[] inverseArray(int[] firstArray, int[] secondArray) {
        int[] operateArray = new int[firstArray.length + secondArray.length];
        System.arraycopy(firstArray, 0, operateArray, 0, firstArray.length);
        System.arraycopy(secondArray, 0, operateArray, firstArray.length, secondArray.length);
        for (int i = 0; i < operateArray.length - 1; i++) {
            for (int z = 0; z < operateArray.length - 1; z++) {
                int backNumber = operateArray[z];
                int frontNumber = operateArray[z + 1];
                if (operateArray[z] > operateArray[z + 1]) {
                    operateArray[z] = frontNumber;
                    operateArray[z + 1] = backNumber;
                }
            }
        }
        return operateArray;
    }
}

