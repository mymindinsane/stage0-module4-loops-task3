package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int num1 = 0;
        int num2 = 1;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = 2;i < lastFibonacci;i++){
            int num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }

    }
}
