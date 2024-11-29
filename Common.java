package sheet2;

import java.util.ArrayList;

public class Common{
    public static int[] commonElements(int[] arr1, int[] arr2) {
        ArrayList<Integer> commonList = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !commonList.contains(arr1[i])) {
                    commonList.add(arr1[i]); 
                    break; 
                }
            }
        }

        // Convert the ArrayList to an array
        int[] result = new int[commonList.size()];
        for (int i = 0; i < commonList.size(); i++) {
            result[i] = commonList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 2, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 4, 5, 6, 7};

        int[] common = commonElements(arr1, arr2);

        // Print the common elements
        System.out.print("Common elements: ");
        for (int i=0;i<common.length;i++) {
            System.out.print(common[i] + " ");
        }
    }
}