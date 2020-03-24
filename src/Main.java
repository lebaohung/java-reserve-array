import javax.naming.SizeLimitExceededException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("RESERVE ARRAY ELEMENTS.");
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of array(under 20): ");
        int size = scanner.nextInt();
        while (size > 20 || size < 2 ) {
            System.out.print("Invalid! Enter again: ");
            size = scanner.nextInt();
        }
        array = new int[size];
        System.out.println("Input " + size + " elements of array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < size / 2; i ++) {
            array[i] = array[i] + array[size-1-i];
            array[size-1-i] = array[i] - array[size-1-i];
            array[i] = array[i] - array[size-1-i];
        }
        System.out.print("Reserve array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
