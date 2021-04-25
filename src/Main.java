class Main {
    public static void main(String[] args) {
        IO stream = new IO();
        Rules checker = new Rules();
        char[] field;
        field = new char [9];

        for(int i = 0; i < 9; i++) {
            int positionInt = stream.input();
            checker.select(field[positionInt]);
            checker.fill(field, i, positionInt);
            stream.output(field[0], field[1], field[2]);
            stream.output(field[3], field[4], field[5]);
            stream.output(field[6], field[7], field[8]);
            if(checker.win(field, field[positionInt], i)) {
                break;
            }
        }
    }
}