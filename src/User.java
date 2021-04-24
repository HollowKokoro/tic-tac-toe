import java.util.Scanner;

class User {
    Scanner position;

    public User() {
        this.position = new Scanner(System.in);
    }

    public int output() {
        int positionInt = 0;
        try {
            positionInt = this.position.nextInt();
        }
        catch (Exception e) {
            System.out.println("Position must be integer: "+e);
        }
        if (positionInt < 0 || positionInt > 8) {
            throw new IllegalArgumentException("Position must be more than 0 and less than 10");
        }
        return positionInt;
    }
}