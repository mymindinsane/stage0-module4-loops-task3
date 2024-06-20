package school.mjc.stage0.loops.task3;

public class NinesSum {
    int sum = 0;
    int currentNumber = 0;
    public void calculateSum(int lengthOfLastNumber) {
        for (int i = 0;i < lengthOfLastNumber;i++){
            currentNumber = 9 + (10 * currentNumber);
            sum += currentNumber;
        }
        System.out.println(sum);
    }
}
