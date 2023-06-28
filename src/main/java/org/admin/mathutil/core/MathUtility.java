package org.admin.mathutil.core;
//we clone class java.util.Math 

public class MathUtility {

    public static final double PI = 3.1415;

//    public static long getFatorial(int n) {
//        if (n < 0) {
//            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
//        } else if (n > 20) {
//            throw new IllegalArgumentException("Factorial greater than 20 is too big.");
//        } else if (n == 0 || n == 1) {
//            return 1;
//        } else {
//            return n * getFatorial(n - 1);
//        }
//    }
    public static long getFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else if (n > 20) {
            throw new IllegalArgumentException("Factorial greater than 20 is too big.");
        }
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * getFatorial(n - 1);
        }
    }

    public static long getAbsolute(long n) {
        if (n < 0) {
            return -n;
        }
        return n;
    }

    public static long getMax(long x, long y) {
        if (x == y) {
            return x;
        } else if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static long getMin(long x, long y) {
        if (x == y) {
            return (x + y) / 2;
        } else if (x > y) {
            return y;
        } else {
            return x;
        }
    }

    public static long getPow(double n, double pow) {
        if (pow == 0 || n == 1) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else if (pow == 1) {
            return (long) n;
        } else {
            double result = 1;
            boolean isNegativeExponent = pow < 0;
            pow = getAbsolute((long) pow);

            for (int i = 0; i < pow; i++) {
                result *= n;
            }

            if (isNegativeExponent) {
                result = 1 / result;
            }

            return (long) result;
        }
    }
}
