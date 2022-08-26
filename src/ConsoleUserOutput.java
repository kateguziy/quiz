public class ConsoleUserOutput implements UserOutput{

    @Override
    public int print()  {
        System.out.println("Вы вышли за допустимые пределы! Попробуйте снова: ");
        return 0;
    }
}
