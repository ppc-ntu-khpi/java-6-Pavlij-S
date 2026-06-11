


package domain;

import java.util.Arrays;

/**
 * Тестовий клас для перевірки працездатності логіки обробки матриць.
 * * @author Pavlij-S
 * @version 1.0
 */
public class Main {

    /**
     * Точка входу в програму. Демонструє роботу класу MatrixProcessor.
     * * @param args аргументи командного рядка
     */
    public static void main(String[] args) {
        // Створюємо тестову матрицю (може бути будь-якого розміру N x M)
        int[][] matrix = {
            {3, 5, 2},   // Сума: 10
            {12, 4, 9},  // Сума: 25 (Максимальна)
            {1, 0, 7}    // Сума: 8
        };

        System.out.println("--- Вхідна матриця ---");
        // Красиве виведення матриці за допомогою Streams та Arrays
        Arrays.stream(matrix).forEach(row -> System.out.println(Arrays.toString(row)));

        // Виклик універсального методу
        int resultIndex = MatrixProcessor.findMaxSumRowIndex(matrix);

        System.out.println("\n--- Результат розрахунку ---");
        System.out.println("Індекс рядка з максимальною сумою: " + resultIndex);
        System.out.println("Вміст цього рядка: " + Arrays.toString(matrix[resultIndex]));
    }
}