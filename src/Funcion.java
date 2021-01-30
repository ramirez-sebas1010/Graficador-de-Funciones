import java.math.BigDecimal;
import java.util.function.Function;

/**
 * Funcion es una clase donde colocamos todas las funciones a ser operadas
 */
public class Funcion {

    private static BigDecimal fact(Integer n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return BigDecimal.valueOf(Math.abs(sum));
    }

    // f(n) = n-100
    public static Function<Integer, BigDecimal> r1 = (n) -> {
        return BigDecimal.valueOf(n - 100);
    };

    // f(n) = n-200
    public static Function<Integer, BigDecimal> r2 = (n) -> {
        return BigDecimal.valueOf(n - 200);
    };

    // f(n) = n^(1/2)
    public static Function<Integer, BigDecimal> r3 = (n) -> {
        return BigDecimal.valueOf(Math.pow(n, 1.0 / 2.0));
    };

    // f(n) = n^(2/3)
    public static Function<Integer, BigDecimal> r4 = (n) -> {
        return BigDecimal.valueOf(Math.pow(n, 2.0 / 3.0));
    };

    // f(n) = 10*log(n)
    public static Function<Integer, BigDecimal> r5 = (n) -> {
        if (n > 1)
            return BigDecimal.valueOf(10 * Math.log(n));

        return null;
    };

    // f(n) = 2*log(n)
    public static Function<Integer, BigDecimal> r6 = (n) -> {
        if (n > 1)
            return BigDecimal.valueOf(2 * Math.log(n));

        return null;
    };

    // f(n) = log(n)^(log(n))
    public static Function<Integer, BigDecimal> r7 = (n) -> {
        if (n > 1)
            return BigDecimal.valueOf(Math.pow(Math.log(n), Math.log(n)));

        return null;

    };

    // f(n) = n/log(n)
    public static Function<Integer, BigDecimal> r8 = (n) -> {
        if (n > 1 && Math.log(n) != 0)
            return BigDecimal.valueOf(n / Math.log(n));

        return null;

    };

    // f(n) = n^(1/2)
    public static Function<Integer, BigDecimal> r9 = (n) -> {
        return BigDecimal.valueOf(Math.pow(n, 1.0 / 2.0));
    };

    // f(n) = log(n)^3
    public static Function<Integer, BigDecimal> r10 = (n) -> {
        if (n > 1)
            return BigDecimal.valueOf(Math.pow(Math.log(n), 3.0));

        return null;

    };

    // f(n) = n*(2^N)
    public static Function<Integer, BigDecimal> r11 = (n) -> {
        return BigDecimal.valueOf(n * Math.pow(2, n));
    };

    // f(n) = (3^N)
    public static Function<Integer, BigDecimal> r12 = (n) -> {
        return BigDecimal.valueOf(Math.pow(3, n));
    };

    // f(n) = n!
    public static Function<Integer, BigDecimal> r13 = (n) -> {
        if (n >= 0)
            return fact(n);

        return null;
    };

    // f(n) = (n+1)!
    public static Function<Integer, BigDecimal> r14 = (n) -> {
        if (n >= 0)
            return fact(n + 1);

        return null;

    };

    // f(n) = n*log(n)
    public static Function<Integer, BigDecimal> r15 = (n) -> {
        if (n > 1)
            return BigDecimal.valueOf(n * Math.log(n));

        return null;

    };

    // f(n) = 10n*log(10n)
    public static Function<Integer, BigDecimal> r16 = (n) -> {
        if (n > 1)
            return BigDecimal.valueOf(10 * n * Math.log(10 * n));

        return null;
    };

    // f(n) = n^(1.01)
    public static Function<Integer, BigDecimal> r17 = (n) -> {
        return BigDecimal.valueOf(Math.pow(n, 1.01));
    };

    // f(n) = log(n)^10
    public static Function<Integer, BigDecimal> r18 = (n) -> {
        if (n > 1)
            return BigDecimal.valueOf(Math.pow(Math.log(n), 10.0));

        return null;

    };

    // f(n) = n^(1/2)
    public static Function<Integer, BigDecimal> r19 = (n) -> {
        return BigDecimal.valueOf(Math.pow(n, 1.0 / 2.0));
    };

    // f(n) = 5^log(n)
    public static Function<Integer, BigDecimal> r20 = (n) -> {
        if (n > 1)
            return BigDecimal.valueOf(Math.pow(5, Math.log(n)));

        return null;

    };

    // f(n) = (n^2)/log(n)
    public static Function<Integer, BigDecimal> r21 = (n) -> {
        if (n > 1 && Math.log(n) != 0)
            return BigDecimal.valueOf(Math.pow(n, 2.0) / Math.log(n));

        return null;
    };

    // f(n) = n*(log(n))^2
    public static Function<Integer, BigDecimal> r22 = (n) -> {
        if (n > 1)
            return BigDecimal.valueOf(n * Math.pow(Math.log(n), 2.0));

        return null;

    };

}