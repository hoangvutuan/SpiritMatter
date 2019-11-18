import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SubSets {

    public static List<int[]> findSubSets(int[] arr) {
        List<int[]> res = new ArrayList<int[]>();
        int[] subset = new int[arr.length];
        findSubSetHelper(arr, subset, 0, res);
        return res;
    }

    private static void findSubSetHelper(int[] arr, int[] subset, int index, List<int[]> res) {
        if (index == arr.length) {
            for (int num: subset) {
                System.out.print(num + "@@@");
            }
          //  res.add(subset); //note: code like this: after running, res will return all result as the same
          //fix: 2 ways: way 1: res.add(Arrays.copyOf(subset, subset.length))
            // way 2: res.add(Arrays.stream(subset).filter(x -> x > -1).toArray());
            res.add(Arrays.stream(subset).filter(x -> x > -1).toArray());
            System.out.println("");
        } else {
            subset[index] = -1;
            findSubSetHelper(arr, subset, index + 1, res);
            subset[index] = arr[index];
            findSubSetHelper(arr, subset, index + 1, res);
        }
    }
    public static void main(String[] args){
        System.out.println("Hello");
        int[] arr = new int[]{1, 2};
        List<int[]> res =  findSubSets(arr);
        for (int[] arrTmp : res) {
            for (int num : arrTmp) {
                System.out.print(num + ", ");
            }
            System.out.println("");
        }
    }
}
