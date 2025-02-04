import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileWriter file = new FileWriter("C:\\Users\\maerd\\Documents\\GitHub\\GitHub Main\\Java\\DSA-in-Java\\WorkWithFiles\\src\\todo.txt", true);
             Scanner cin = new Scanner(System.in)) {

            System.out.println("> ");
            while (true) {
                String line = cin.nextLine();
                if (line.equalsIgnoreCase("Выход")) {
                    System.out.println("Выход из программы.");
                    return;
                }
                file.write(line + "\n");
                file.flush(); // Сброс буфера
                System.out.println("Добавлено: " + line);
            }
        } catch (IOException e) {
            System.out.printf("Ошибка: %s", e);
        }
    }
}
