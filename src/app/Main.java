package src.app;

public class Main {

    private final static String BASE_PATH = "files/";

    public static void main(String[] args) {
        FileHandler handler = new FileHandler();
        String fileName = "file";
        String fileContent = "My very important information.";

        // Пишем данные в файл
        String result = handler.writeFile(fileName, fileContent);

        // Читаем данные из файла
        String content = handler.readFile(BASE_PATH + fileName + ".txt");

        // Выводим результат
        getOutput("RESULT: " + result);
        getOutput("FILE CONTENT: " + content);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
