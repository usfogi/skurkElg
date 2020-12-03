import java.util.HashMap;
import java.util.Map;

public class TwoSumResolver {

    private final static String MESSAGE = "No solution for this two sum";

    public int[] twoSumBrut(int[] arr, int targ) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targ) {
                    return new int[]{i, j};
                }
            }
        }

        throw new IllegalArgumentException(MESSAGE);
    }

    public int[] twoSumTwoLoop(int[] arr, int targ) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int delta = targ - arr[i];
            if (map.containsKey(delta) && map.get(delta) != i) {
                return new int[] { i, map.get(delta)};
            }
        }

        throw new IllegalArgumentException(MESSAGE);
    }

    public  int[] twoSumOneLoop(int[] arr, int targ) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int delta = targ - arr[i];
            if (map.containsKey(delta)) {
                return new int[] { map.get(delta), i };
            }
            map.put(arr[i], i);
        }

        throw new IllegalArgumentException(MESSAGE);
    }
}
