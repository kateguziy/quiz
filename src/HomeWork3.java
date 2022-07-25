import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        int correctCount = 0, wrongCount = 0;
        String[] questions = {
                "Инкапсуляция - это ",
                "Какие типы данных относятся к целочисленным?",
                "Выберите модификатор доступа, при котором обращаться к переменным/методам можно только из класса, в котором он объявлен"
        };
        String[][] answerOptions = {{"1. свойство системы, позволяющее объединить данные и методы, работающие с " +
                "ними, в классе и скрыть детали реализации от пользователя, открыв только то, что необходимо при " +
                "последующем использовании", "2. свойство системы, позволяющее описать новый класс на основе уже " +
                "существующего с частично или полностью заимствующейся функциональностью", "3. свойство системы " +
                "использовать объекты с одинаковым интерфейсом без информации о типе и внутренней структуре объекта",
                "4. способ выделить набор общих характеристик объекта, исключая из рассмотрения частные и незначимые." +
                        "Соответственно, ... – это набор всех таких характеристик"},
                {"1. boolean, char ", "2. byte, short, int, long", "3. byte, float, short, int, long",
                        "4. double, byte, short, int, long, char"},
                {"1. protected", "2. public", "3. default", "4. private"}
        };
        int[] correctAnswers = {1, 2, 4};
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (int j = 0; j < answerOptions[i].length; j++) {
                System.out.println(answerOptions[i][j]);
            }
            System.out.print("Ваш ответ: ");
            if (scanner.nextInt() == correctAnswers[i]) {
                System.out.println("Правильно");
                correctCount++;
            } else {
                System.out.println("Неправильно");
                wrongCount++;
            }
        }
        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}
