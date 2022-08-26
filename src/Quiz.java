
public class Quiz {
    private final String question;
    private final String[] answers;
    private final int correctAnswer;
    private final UserInput input = new ConsoleUserInput();


    public Quiz(String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public boolean ask() {
        System.out.println(question);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i]);
        }
        return input.read() == correctAnswer;
    }
}
