package domain;

import java.util.Arrays;

/**
 * Універсальний клас для обробки та аналізу матриць.
 * Містить чисту логіку обчислень без елементів інтерфейсу користувача.
 * * @author Pavlij-S
 * @version 1.0
 */
public class MatrixProcessor {

    /**
     * Приватний конструктор для запобігання створення екземплярів утилітарного класу.
     */
    private MatrixProcessor() {}

    /**
     * Знаходить індекс рядка матриці, який містить максимальну суму елементів.
     * Реалізовано без використання циклів за допомогою Stream API та класу Arrays.
     * * @param matrix двовимірний масив цілих чисел (матриця N x M)
     * @return індекс рядка з максимальною сумою (починаючи з 0), 
     * або -1, якщо матриця порожня чи null.
     */
    public static int findMaxSumRowIndex(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return -1;
        }

        // 1. Обчислюємо суму для кожного рядка без використання циклів
        long[] rowSums = Arrays.stream(matrix)
                .mapToLong(row -> Arrays.stream(row).summaryStatistics().getSum())
                .toArray();

        // 2. Знаходимо індекс максимального значення у масиві сум
        return java.util.stream.IntStream.range(0, rowSums.length)
                .reduce((i, j) -> rowSums[i] >= rowSums[j] ? i : j)
                .orElse(-1);
    }
}