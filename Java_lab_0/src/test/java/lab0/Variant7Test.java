package lab0;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Variant7Test {

    //1. Integer: Дано двоцифрове число. Знайти суму і добуток його цифр.
    @Test(dataProvider = "integerProvider")
    public void testIntegerNumbersTask(int input, int[] expected) {
        assertEquals(new Variant7().integerNumbersTask(input), expected);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] {
                {34, new int[]{7, 12}}, // 3 + 4 = 7, 3 * 4 = 12
                {56, new int[]{11, 30}}, // 5 + 6 = 11, 5 * 6 = 30
                {91, new int[]{10, 9}}   // 9 + 1 = 10, 9 * 1 = 9
        };
    }

    // 2. Boolean: Дано три цілих числа: A, B, C. Перевірити істинність висловлювання: «Число B знаходиться між числами A та C».
    @Test(dataProvider = "booleanProvider")
    public void testIsBetween(int A, int B, int C, boolean expected) {
        assertEquals(new Variant7().booleanTask(A, B, C), expected);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][] {
                {4, 5, 10, true},    // 5 знаходиться між 4 та 10
                {10, 5, 4, true},    // 5 знаходиться між 10 та 4
                {1, 2, 3, true},      // 2 знаходиться між 1 та 3
                {5, 7, 8, true},      // 7 знаходиться між 5 та 8
                {10, 15, 12, false},  // 15 не знаходиться між 10 та 12
                {3, 1, 2, false},     // 1 не знаходиться між 3 та 2
                {8, 10, 5, false}     // 10 не знаходиться між 8 та 5
        };
    }

    // 3. If: Дано два числа. Вивести порядковий номер меншого з них.
    @Test(dataProvider = "smallerNumberProvider")
    public void testFindSmallerNumberPosition(int A, int B, int expected) {
        assertEquals(new Variant7().ifTask(A, B), expected);
    }

    @DataProvider
    public Object[][] smallerNumberProvider() {
        return new Object[][] {
                {3, 5, 1},  // A менше B, тому повертаємо 1
                {7, 2, 2},  // B менше A, тому повертаємо 2
                {4, 4, 0},  // A та B однакові, тому повертаємо 0
                {0, -1, 2}, // B менше A, тому повертаємо 2
                {-5, -3, 1} // A менше B, тому повертаємо 1
        };
    }

    // 4. Case: Одиниці маси пронумеровані в такий спосіб: 1 — кілограм, 2— міліграм, 3— грам, 4— тонна, 5— центнер. Даний номер одиниці маси (ціле число в діапазоні 15) і маса тіла в цих одиницях (речове число). Знайти масу тіла в кілограмах.
    @Test(dataProvider = "massConversionProvider")
    public void testConvertMassToKilograms(int unitNumber, double mass, double expected) {
        assertEquals(new Variant7().caseTask(unitNumber, mass), expected, 0.0001);
    }

    @DataProvider
    public Object[][] massConversionProvider() {
        return new Object[][] {
                {1, 5, 5},              // 5 кг = 5 кг
                {2, 5000000, 5},        // 5 000 000 мг = 5 кг
                {3, 5000, 5},           // 5000 г = 5 кг
                {4, 2, 2000},           // 2 т = 2000 кг
                {5, 20, 2000}           // 20 ц = 2000 кг
        };
    }

    // 5. For: Дано два цілих числа A та B (A < B). Знайти суму всіх цілих чисел від A до B включно.
    @Test(dataProvider = "forProvider")
    public void testForTask(int A, int B, int expected) {
        assertEquals(new Variant7().forTask(A, B), expected);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][] {
                {1, 5, 15}, // 1 + 2 + 3 + 4 + 5 = 15
                {3, 7, 25}, // 3 + 4 + 5 + 6 + 7 = 25
                {10, 15, 75} // 10 + 11 + 12 + 13 + 14 + 15 = 75
        };
    }

    // 6. While: Дано ціле число NN (> 0). Знайти найменше ціле позитивне число K, квадрат якого перевищує N: K^2 >  N. Функцію вилучення квадратного кореня не використовувати.
    @Test(dataProvider = "whileProvider")
    public void testWhileTask(int N, int expected) {
        assertEquals(new Variant7().whileTask(N), expected);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][] {
                {10, 4}, // 4^2 = 16 > 10
                {15, 4}, // 4^2 = 16 > 15
                {20, 5}  // 5^2 = 25 > 20
        };
    }

    // 7. Array: Дано масив розміру N. Вивести його елементи в зворотному порядку.
    @Test(dataProvider = "arrayProvider")
    public void testArrayTask(float[] array, float[] expected) {
        assertEquals(new Variant7().arrayTask(array), expected);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][] {
                {new double[]{1, 2, 3}, new double[]{3, 2, 1}},
                {new double[]{4, 5, 6, 7}, new double[]{7, 6, 5, 4}}
        };
    }

    // 8. Matrix: Дана матриця розміру M × N і ціле число K (1 ≤ K ≤ M). Вивести елементи K-го рядка даної матриці.
    @Test(dataProvider = "matrixProvider")
    public void testPrintKthRow(int[][] matrix, int k, int[] expected) {
        assertEquals(new Variant7().printKthRow(matrix, k), expected);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        return new Object[][] {
                {new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}, 1, new int[]{1, 2, 3, 4}},
                {new int[][]{{1, 2, 3}, {4, 5, 6}}, 2, new int[]{4, 5, 6}},
                {new int[][]{{10, 20}, {30, 40}, {50, 60}}, 3, new int[]{50, 60}}
        };
    }
}