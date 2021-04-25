public class Rules {
    IO stream = new IO();
    public void select(char field) {
        if (field != '\u0000') {
            System.out.println("This cell is not empty");
            stream.input();
        }
    }
    public void fill(char[] field,int turn, int position) {
        // if turn is 1, 3 etc
        if (turn % 2 == 0) {
            field[position] = 'X';
        } else {
            field[position] = 'O';
        }
    }
    public boolean win(char[] field, char sign, int i) {
        boolean flag = false;
        if(field[0] == sign & field[3] == sign & field[6] == sign) {
            System.out.println(sign + " won");
            flag = true;
        } else if(field[0] == sign & field[1] == sign & field[2] == sign) {
            System.out.println(sign + " won");
            flag = true;
        } else if(field[3] == sign & field[4] == sign & field[5] == sign) {
            System.out.println(sign + " won");
            flag = true;
        } else if(field[6] == sign & field[7] == sign & field[8] == sign) {
            System.out.println(sign + " won");
            flag = true;
        } else if(field[1] == sign & field[4] == sign & field[7] == sign) {
            System.out.println(sign + " won");
            flag = true;
        } else if(field[2] == sign & field[5] == sign & field[8] == sign) {
            System.out.println(sign + " won");
            flag = true;
        } else if(field[0] == sign & field[4] == sign & field[8] == sign) {
            System.out.println(sign + " won");
            flag = true;
        } else if(field[2] == sign & field[4] == sign & field[6] == sign) {
            System.out.println(sign + " won");
            flag = true;
        } else if(i == 8) {
            System.out.println(sign + " won");
            flag = true;
        }
        return flag;
    }
}
