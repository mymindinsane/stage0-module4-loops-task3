package school.mjc.stage0.loops.task3;

public class DigitsSum {
    int sum = 0;
    public void printDigitsSum(int t){
        String empty = "";
        int length = (t + empty).length();
        for (int i = 0;i < length;i++){
            sum += Math.abs(t) % (int)(Math.pow(10,i + 1)) / Math.pow(10, i) ;
        }
        System.out.println(sum);
    }
}
