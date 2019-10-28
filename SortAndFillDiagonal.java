import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.HashMap;
import java.util.Objects;


public class SortAndFillDiagonal {
    public static void sortAndFillDiagonal(int[] arr, int[][] matrix) {

        /*
        List<Integer> listTmp = Arrays.asList(arr);
        Arrays.asList(arr).sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }

        } );
*/

    //    Arrays.sort(arr);
    //2 ways to box
        Integer[] arr1 = Arrays.stream( arr ).boxed().toArray( Integer[]::new );


        List<Integer> list  = Arrays.stream( arr ).boxed().collect( Collectors.toList() );
        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        Map<Integer, Integer> map = new HashMap<Integer, Integer> ();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //sort tang value:
        //if o1 < o2 => return AM => return o1 - o2
        //if o1 > o2 => return DUONG => return o1 - o2
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.get(o1) != map.get(o2)) {
                    return map.get(o2) - map.get(o1);
                } else{
                    return o1 - o2;
                }
            }
        });

        //Do as below: wrong, because arr is still using the same address as param.
        int[] arrNew = list.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .toArray();

        System.arraycopy(arrNew, 0, arr, 0, arrNew.length);

        //arr is now sorted
        //fill diagonally
        //
        int n = (int)Math.sqrt(arr.length);
        int[] count  = new int[1];
        count[0] = 0;
        for (int i = n - 1; i >= 0; i-- ) {
            fillDiagonal(n - 1, i,  i,n - 1, count, arr, matrix);
        }

        for (int i = n - 2; i >= 0; i--) {
            fillDiagonal( i, 0, 0, i, count, arr, matrix);
        }
        int a = 5;
    }

    private static void fillDiagonal(int row, int col, int row1, int col1, int[] count, int[] arr, int[][] matrix) {
        int c = count[0];
        // code in the comment   is wrong, becarefull in another problem.
        /*
        for (int i = row; i >= row1; i--) {
            for (int j = col; j <= col1; j++) {
                matrix[i][j] = arr[c++];
            }
        }
        */
        for (int i = row, j = col; i >= row1 && j <= col1; i--, j++){
            matrix[i][j] = arr[c++];
            count[0] = c;
        }
        int a = 9;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int[] arr = new int[]{1, 2, 3, 2, 2, 1, 3, 7, 5};
        int[][] matrix = new int[3][3];
        sortAndFillDiagonal(arr, matrix);
        for (int num : arr) {
            System.out.println(num);
        }
        System.out.println("---");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("");
        }

    }
}
