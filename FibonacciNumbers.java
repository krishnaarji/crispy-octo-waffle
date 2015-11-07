import java.util.*;

public class FibonacciNumbers {

    public List<Integer> filterByIndex(LinkedList<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return Collections.emptyList();
        }

        List<Integer> fibonacciNumbers = new ArrayList<>();
        Iterator<Integer> iterator = numbers.iterator();

        // add first number & remove it
        fibonacciNumbers.add(iterator.next());
        iterator.remove();

        int prevFibIndex = 1;
        int nextFibIndex = 2;
        int currentIndex = 2;

        while (iterator.hasNext() && nextFibIndex > 0) {
            Integer number = iterator.next();
            if (currentIndex == nextFibIndex) {
                // remove number from first list & add it to second list
                iterator.remove();
                fibonacciNumbers.add(number);
                // calculate next fibonacci index number
                int tmp = nextFibIndex;
                nextFibIndex = prevFibIndex + nextFibIndex;
                prevFibIndex = tmp;
            }

            currentIndex++;
        }

        return fibonacciNumbers;
    }

    public static void main(String[] args) {
        LinkedList<Integer> input = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        FibonacciNumbers test = new FibonacciNumbers();
        List<Integer> output = test.filterByIndex(input);
        System.out.println("Fibonacci: " + output);
        System.out.println("Filtered: " + input);
    }
}
