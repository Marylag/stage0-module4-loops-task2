package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            return;
        }

        int i = 0;
        int end = Math.abs(multiplyByAndToInclusive);

        while (i <= end) {
            System.out.println(i * multiplyByAndToInclusive);
            i++;
        }
    }
}
