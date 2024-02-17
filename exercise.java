public class exercise {
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
    
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n cannot be negative");
        }
        
        if (n == 0) {
            return 0;
        }
        
        if (n == 1) {
            return 1;
        }
        
        int a = 0;
        int b = 1;
        int fib = 0;
        
        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }
        
        return fib;
    }
    
    public static boolean isWithoutZeroAndMinusOne(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 || arr[i] == -1) {
                return false;
            }
        }
        
        return true;
    }
}
