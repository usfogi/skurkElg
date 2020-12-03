public class Main {
    public static void main(String[] args) {
        TwoSumResolver foo = new TwoSumResolver();

        int[] res = foo.twoSumBrut(new int[] {2, 4, 6, 1, 7, 5}, 10);
        System.out.println(res[0] + " " + res[1]);

        int[] res2 = foo.twoSumTwoLoop(new int[] {2, 4, 6, 1, 7, 5}, 10);
        System.out.println(res2[0] + " " + res2[1]);

        int[] res3 = foo.twoSumOneLoop(new int[] {2, 4, 6, 1, 7, 5}, 10);
        System.out.println(res3[0] + " " + res3[1]);
    }
}
