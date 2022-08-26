import java.util.Scanner;

public class QuestionProcess {
    private int countRight;
    private Quiz testElements[];
    private int countWrong;

    public QuestionProcess(Scanner questionProcess, Quiz[] testElements) {
        this.testElements = testElements;
        this.countRight = 0;
        this.countWrong = 0;
    }

    public void printResult() {
        System.out.println("Результат: правильно " + countRight + ", неправильно " + countWrong);
    }

    private String right() {
        countRight++;
        return "Правильно";
    }

    private String wrong() {
        countWrong++;
        return "Неправильно";
    }

    public void test() {
        for (int i = 0; i < testElements.length; i++) {
            boolean result = testElements[i].ask();
            if (result) {
                right();
            } else {wrong();}
        }
        printResult();
    }
}
