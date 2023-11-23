package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        long factorial = 1;
        int i = 0;
        while (i <= printToInclusive) {
            if (i == 0 || i == 1) {
                factorial = 1;
            } else {
                factorial *= i;
            }
            System.out.println(factorial);
            i++;
        }
    }
}
