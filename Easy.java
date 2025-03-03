import java.util.ArrayList;
import java.util.Scanner;

public class Autoboxing {
    public static int calculateSum(ArrayList<Integer> numbers) {
        int sum = 0;  
        for (Integer num : numbers) {
            sum += num;  
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by space: ");
        String input = scanner.nextLine();
        String[] tokens = input.split(" ");

        for (String token : tokens) {
            numbers.add(Integer.parseInt(token)); 
        }

        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);
        
        scanner.close();
    }
}
