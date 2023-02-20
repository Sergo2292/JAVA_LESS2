public class LessTwo {
    public static void main(String[] args) {
        /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
              что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
              в противном случае – false.*/
        System.out.println(twoNumber(10, 5));
        /*
        2. Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом.
         */
        PositiveOrNegative(3);
        PositiveOrNegative(-3);
        /*
        3. Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
         */
        System.out.println(isNegative(-5));
        /*
       4. Написать метод, которому в качестве аргументов передается строка и число,
        метод должен отпечатать в консоль указанную строку, указанное количество раз;
         */
        printWordNTimes("Sergey", 7);
        /*
        5. * Написать метод, который определяет, является ли год високосным,
        и возвращает boolean (високосный - true, не високосный - false).
        Каждый 4-й год является високосным, кроме каждого 100-го,
        при этом каждый 400-й – високосный.
         */
        System.out.println(LeapYear(1992));
    }

    public static boolean twoNumber(int a, int b) {
        boolean result = true;
        int c = a + b;
        if (c > 10 && c <= 20) {
            return true;
        } else {
            return false;

        }
    }

    public static void PositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println(a + " is positive");
        } else {
            System.out.println(a + " is negative");
        }
    }

    static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }

    public static boolean LeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
