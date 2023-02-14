import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inputValues = sc.nextLine();

        // extracting values
        List<Integer> values = Arrays.stream(inputValues.split(",")).map(Integer::parseInt).collect(Collectors.toList());

        // finding grade using findGrade() method of Grade class
        System.out.println(Grade.findGrade(values.get(0), values.get(1)));

        // closing resource
        sc.close();
    }
}