public class Main {
    public static void main(String[] args) {
        Logger simple = new SimpleLogger();
        Logger smart = new SmartLogger();

        simple.log("Программа запущена");

        smart.log("Запрос выполнен");
        smart.log("Произошла error при обработке данных");
        smart.log("Работа завершена");
    }
}
