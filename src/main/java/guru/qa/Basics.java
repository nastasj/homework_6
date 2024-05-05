package guru.qa;

public class Basics {
    public static void main(String args[]) {
        int a = 10;
        int b = 25;
        int с = 3;
        boolean d = true;
        boolean e = false;
        byte f = Byte.MAX_VALUE;
        int g = 8;
        double h = 15;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        a++;
        System.out.println("a++   = " +  (a++));
        b--;
        System.out.println("b--   = " +  (b--));
        System.out.println("с++   = " +  (с++));
        System.out.println("++с   = " +  (++с));
        System.out.println("d && e = " + (d && e) );
        System.out.println("d || e = " + (d || e) );
        System.out.println("!d = " + (!d) );
        System.out.println("Пример переполнения вычислений: " + f + " + 1  = " + (byte) (f + 1));
        System.out.println("Пример вычисления комбинаций типов данных (int и double): " + g + " + " + h + " = " + (g + h));
    }
}
