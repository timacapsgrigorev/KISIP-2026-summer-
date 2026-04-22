import java.util.Scanner;
import java.util.Arrays;

public class BestTravelInteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите расстояния через пробел (например: 50 55 57 58 60):");
        String[] inputDistances = scanner.nextLine().split(" ");
        int[] distances = Arrays.stream(inputDistances).mapToInt(Integer::parseInt).toArray();

        System.out.println("Введите лимит бензина (например, 175):");
        int limit = scanner.nextInt();

        System.out.println("Введите количество городов для посещения (например, 3):");
        int towns = scanner.nextInt();

        Integer result = chooseBestSum(limit, towns, distances);

        if (result == null) {
            System.out.println("Нет подходящей комбинации");
        } else {
            System.out.println("Максимальная сумма: " + result);
        }

        scanner.close();
    }
}