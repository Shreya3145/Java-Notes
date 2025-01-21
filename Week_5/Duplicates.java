package Week_5;
public class Duplicates {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {20, 30};
        int[] res = new int[arr1.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] != arr2[j]) {
                    res[index] = arr1[i];
                }
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(res[i]);
        }
    }
}