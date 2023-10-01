package ru.grishny;

public class LearningOperators {
    public static void main(String args[]) {

        byte aByte = 120;
        short aShort = 32700;
        int aInt = 327000;
        int aIntMax = Integer.MAX_VALUE;
        long aLong = 3270000;

        float aFloat = 1.1f;
        double aDouble = 1000.1;

        //математические операторы
        System.out.println("aByte + aByte = " + (aByte + aByte)); //ответ приводится к следующему типу short
        System.out.println("aByte + aShort = " + (aByte + aShort)); //ответ приводится к следующему типу int
        System.out.println("aShort + aShort = " + (aShort + aShort)); //ответ приводится к следующему типу int
        System.out.println("aShort + aInt = " + (aShort + aInt));
        System.out.println("aInt + aInt = " + (aInt + aInt));
        System.out.println("aInt + aLong = " + (aInt + aLong));
        System.out.println("aIntMax + aByte = " + (long)(aIntMax + aByte)); //неожиданно
        System.out.println("aByte - aByte = " + (aByte - aByte));
        System.out.println("aInt ++ = " + ++aInt);

        System.out.println("aByte * aByte = " + (aByte * aByte));
        System.out.println("aShort / aByte = " + (aShort / aByte)); //в языке Java результат деления целого числа на целое – это всегда целое число, остаток при делении отбрасывается
        System.out.println("aShort % aByte = " + (aShort % aByte));
        System.out.println("aByte / aFloat = " + (aByte / aFloat));
        System.out.println("aByte % aFloat = " + (aByte % aFloat));

        System.out.println("aDouble / afloat = " + (aDouble / aFloat));
        System.out.println("aDouble % afloat = " + (aDouble % aFloat));

        System.out.println("aInt + aFloat = " + (aInt + aFloat)); //ответ приводится к следующему типу float
        System.out.println(("aInt * aDouble = " + (aInt * aDouble))); //ответ приводится к следующему типу double

        //логические операторы
        int number = 9;

        if (number % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

        //тернарный оператор
        String evenOrOdd = (number % 2 == 0) ?  "Четное" : " Нечетное";
        System.out.println(evenOrOdd);
    }
}
