class Main {
    static char[] fill;

    public Main() {
        fill = new char [9];
    }

    public static void main(String[] args) {
        User obj = new User();
        int positionInt = obj.output();

        if (fill[positionInt] != '\u0000') {
            throw new IllegalArgumentException("This cell is not empty");
        }
        for (int i = 0; i < 9; i++) {
            // if turn is even
            if (i % 2 == 0) {
                fill[positionInt] = 'O';
            } else {
                fill[positionInt] = 'X';
            }
            System.out.println("test");
        }
    }
}