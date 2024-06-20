package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int sum = 0;
        int max = Math.max(firstBoarder,secondBoarder);
        int min = (Math.min(firstBoarder,secondBoarder));
        for (int i = min;i <= max;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
