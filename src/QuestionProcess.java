import java.util.Scanner;

public class QuestionProcess {
    private final Scanner scanner;
    private int countRight;
    private int countWrong;

    public QuestionProcess(Scanner questionProcess) {
        this.scanner = questionProcess;
        this.countRight = 0;
        this.countWrong = 0;
    }

    public void readQuestion(Quiz question) {
        System.out.println(question.getQuestion());
        for (int i = 0; i < question.getAnswers().length; i++) {
            System.out.println(question.getAnswers()[i]);
        }
        System.out.println(scanner.nextInt() == question.getCorrectAnswer() ? right() : wrong());
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
}
