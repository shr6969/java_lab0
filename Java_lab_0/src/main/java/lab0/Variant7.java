package lab0;

public class Variant7 {

    public enum DAY_OF_WEEK {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    /**
     * 1. Integer: Дано двоцифрове число. Знайти суму і добуток його цифр.
     *
     * @param k is a two-digit integer
     * @return an array where the first element is the sum and the second is the product of the digits
     */
    public int[] integerNumbersTask(int k) {
        int tens = k / 10;
        int units = k % 10;
        return new int[] { tens + units, tens * units };
    }

    /**
     * 2. Boolean: Дано три цілих числа: A, B, C. Перевірити істинність висловлювання: «Число B знаходиться між числами A та C».
     *
     * @param a integer A
     * @param b integer B
     * @param c integer C
     * @return true if B is between A and C, false otherwise
     */
    public boolean booleanTask(int a, int b, int c) {
        return (a < b && b < c) || (c < b && b < a);
    }

    /**
     * 3. If: Дано два числа. Вивести порядковий номер меншого з них.
     *
     * @param a integer A
     * @param b integer B
     * @return 1 if A is smaller, 2 if B is smaller
     */
    public int ifTask(int a, int b) {
        if (a < b) {
            return 1;
        } else if (b < a) {
            return 2;
        } else {
            return 0;
        }
    }

    /**
     * 4. Case: Одиниці маси пронумеровані в такий спосіб: 1 — кілограм, 2— міліграм, 3— грам, 4— тонна, 5— центнер. Даний номер одиниці маси (ціле число в діапазоні 15) і маса тіла в цих одиницях (речове число). Знайти масу тіла в кілограмах.
     *
     * @param unitNumber mass unit number (1 - kilogram, 2 - milligram, 3 - gram, 4 - ton, 5 - centner)
     * @param mass mass value in specified units
     * @return mass in kilograms
     */
    public double caseTask(int unitNumber, double mass) {
        switch (unitNumber) {
            case 1: // Кілограм
                return mass;
            case 2: // Міліграм
                return mass / 1_000_000; // 1 міліграм = 0.000001 кілограма
            case 3: // Грам
                return mass / 1000; // 1 грам = 0.001 кілограма
            case 4: // Тонна
                return mass * 1000; // 1 тонна = 1000 кілограмів
            case 5: // Центнер
                return mass * 100; // 1 центнер = 100 кілограмів
            default:
                throw new IllegalArgumentException("Невірний номер одиниці маси. Діапазон: 1-5.");
        }
    }

    /**
     * 5. For: Дано два цілих числа A та B (A < B). Знайти суму всіх цілих чисел від A до B включно.
     *
     * @param a integer A
     * @param b integer B
     * @return sum of all integers from A to B
     */
    public int forTask(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * 6. While: Дано ціле число NN (> 0). Знайти найменше ціле позитивне число K, квадрат якого перевищує N: K^2 >  N. Функцію вилучення квадратного кореня не використовувати.
     *
     * @param n integer N
     * @return smallest integer K such that K^2 > N
     */
    public int whileTask(int n) {
        int k = 1;
        while (k * k <= n) {
            k++;
        }
        return k;
    }

    /**
     * 7. Array: Дано масив розміру N. Вивести його елементи в зворотному порядку.
     *
     * @param array input array
     * @return array in reverse order
     */
    public float[] arrayTask(float[] array) {
        float[] reversed = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    /**
     * 8. Matrix: Дана матриця розміру M × N і ціле число K (1 ≤ K ≤ M). Вивести елементи K-го рядка даної матриці.
     *
     * @param matrix two-dimensional matrix
     * @param k      line number to output (1-indexed)
     */
    public int[] printKthRow(int[][] matrix, int k) {
        if (k < 1 || k > matrix.length) {
            throw new IllegalArgumentException("Неправильний номер рядка: " + k);
        }
        return matrix[k - 1]; // Повертаємо k-ий рядок, зменшуючи на одиницю для 0-індексації
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab var7");
        System.out.println("Done!!!");
    }
}
