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
        if (win_condition(field[0], field[1], field[2], sign)) {
            return true;
        }
        if (win_condition(field[3], field[4], field[5], sign)) {
            return true;
        }
        if (win_condition(field[6], field[7], field[8], sign)) {
            return true;
        }
        if (win_condition(field[0], field[3], field[6], sign)) {
            return true;
        }
        if (win_condition(field[1], field[4], field[7], sign)) {
            return true;
        }
        if (win_condition(field[2], field[5], field[8], sign)) {
            return true;
        }
        if (win_condition(field[0], field[4], field[8], sign)) {
            return true;
        }
        if (win_condition(field[2], field[4], field[6], sign)) {
            return true;
        }
        if (i == 8) {
            System.out.println("O won");
            return true;
        }
        return false;
    }
    private boolean win_condition(char fieldOne, char fieldTwo, char fieldThree, char sign) {
        if (fieldOne == sign & fieldTwo == sign & fieldThree == sign) {
            System.out.println(sign + " won");
            return true;
        }
        return false;
    }
}
