import java.util.*;

class Main {
    public static void main(String[] args) {
        int allCount;
        Scanner scanner = new Scanner(System.in);
        allCount = scanner.nextInt();
        int end = scanner.nextInt();
        Main main = new Main();
        int[] nums = new int[allCount];
        main.method02(1, end, allCount, 0, nums);
    }

    public void method02(int begin, int end, int allCount, int arrayCount, int[] returnNums) {
        if (allCount == arrayCount) {
            for (int i = 0; i < returnNums.length; i++) {
                System.out.print(returnNums[i] + " ");
            }
            System.out.println();
        } else {
            for (int i1 = begin; i1 <= end; i1++) {
                returnNums[arrayCount++] = i1;
                method02(i1 + 1, end, allCount, arrayCount, returnNums);
                arrayCount--;
            }
        }
    }
}