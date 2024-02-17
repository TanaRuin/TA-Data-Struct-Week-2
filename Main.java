public class Main {
    public static void main(String[] args) {
        int[] arr = {100, 521, -76, -12, 174};
        
        System.out.println("Task 1: Find maximum value in array");
        long startTime = System.nanoTime();
        int max = exercise.findMax(arr);
        long endTime = System.nanoTime();
        System.out.println("The maximum value in the array is: " + max);
        System.out.println("Time complexity: " + (endTime - startTime) + " ns");
        
        System.out.println("\nTask 2: Generate nth Fibonacci number");
        startTime = System.nanoTime();
        int n = 10;
        int fib = exercise.fibonacci(n);
        endTime = System.nanoTime();
        System.out.println("The " + n + "th Fibonacci number is: " + fib);
        System.out.println("Time complexity: " + (endTime - startTime) + " ns");
        
        System.out.println("\nTask 3: Check if array is without 0 and -1");
        startTime = System.nanoTime();
        boolean withoutZeroAndMinusOne = exercise.isWithoutZeroAndMinusOne(arr);
        endTime = System.nanoTime();
        System.out.println("The array is without 0 and -1: " + withoutZeroAndMinusOne);
        System.out.println("Time complexity: " + (endTime - startTime) + " ns");
    }
}