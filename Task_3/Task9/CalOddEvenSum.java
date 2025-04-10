package Task_9;

import java.util.Arrays;
import java.util.List;

public class CalOddEvenSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        int oddSum = numbers.stream()
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        int evenSum = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of Odd Numbers: " + oddSum);
        System.out.println("Sum of Even Numbers: " + evenSum);
    }
}
