package codeflow;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        //this.seats[0][0] = "X"; mistake: array needs to be initialized first
        this.seats = new String[rows][seats];
        this.seats[0][0] = "X";
        for (int i = 0; i < rows; i++) { // mistake: all the other seats weren't initialized
            for (int j = 0; j < seats; j++) {
                this.seats[i][j] = "O";
            }
        }
    }

    public int getRows() {
        return seats.length;
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
         if (seats[row][seat].equals("O")) {
            seats[row][seat] = "X";
            return true;

        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        if (seats[row][seat].equals("X")) { // mistake: changed from "x" to "X" to check if the seat is reserved
            seats[row][seat] = "O";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = ""; // mistake: was null. Changed to empty string ""
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}