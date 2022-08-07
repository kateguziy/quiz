import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quiz quiz1 = new Quiz(
                "Инкапсуляция - это ",
                new String[]{"1. свойство системы, позволяющее объединить данные и методы, работающие с ними, " +
                        "в классе и скрыть детали реализации от пользователя, открыв только то, что необходимо " +
                        "при последующем использовании",
                        "2. свойство системы, позволяющее описать новый класс на основе уже существующего с частично " +
                                "или полностью заимствующейся функциональностью",
                        "3. свойство системы использовать объекты с одинаковым интерфейсом без информации о типе " +
                                "и внутренней структуре объекта",
                        "4. способ выделить набор общих характеристик объекта, исключая из рассмотрения частные " +
                                "и незначимые. Соответственно, ... – это набор всех таких характеристик"},
                1
        );

        Quiz quiz2 = new Quiz(
                "Какие типы данных относятся к целочисленным?",
                new String[]{"1. boolean, char ",
                        "2. byte, short, int, long",
                        "3. byte, float, short, int, long",
                        "4. double, byte, short, int, long, char"},
                2
        );

        Quiz quiz3 = new Quiz(
                "Выберите модификатор доступа, при котором обращаться к переменным/методам можно только из " +
                        "класса, в котором он объявлен",
                new String[]{"1. protected",
                        "2. public",
                        "3. default",
                        "4. private"},
                4
        );

        QuestionProcess questionProcess = new QuestionProcess(new Scanner(System.in));
        questionProcess.readQuestion(quiz1);
        questionProcess.readQuestion(quiz2);
        questionProcess.readQuestion(quiz3);
        questionProcess.printResult();
    }
}
