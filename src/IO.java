import java.util.Scanner;
import java.util.Arrays;

public class IO {
    Scanner position;

    public IO() {
        this.position = new Scanner(System.in);
    }

    public int input() {
        int positionInt;
        if (!position.hasNextInt()) {
            System.out.println("Incorrect type. Position must be integer more than 0 and less than 8");
            input();
        }
        positionInt = position.nextInt();
        if (positionInt < 0 || positionInt > 8) {
            System.out.println("Position out of range. Position must be integer more than 0 and less than 8");
            input();
        }
        return positionInt;
    }
    public void output(char field1, char field2, char field3) {
        char[] line = {field1, field2, field3};
        String lineForOutput = Arrays.toString(line);
        System.out.println(lineForOutput);
    }
}