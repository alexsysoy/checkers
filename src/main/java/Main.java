import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести размерность поля ");
        // Размерность доски
        int DIMENSION = scanner.nextInt();
        System.out.print("Ввести начальный столбец шашки ");
        int startPosition = scanner.nextInt();

        // y - столбец, в котором первоначально находится шашка
        List<IntPair> roads = Handler.getIntPairs(DIMENSION, startPosition);
        System.out.println("Количество путей шашки: " + roads.size());
    }
}