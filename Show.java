public class Show {
    public boolean isAisleSeat(int row, seatNumber) {
        if (seatNumber == 0 || seatNumber == SEATS_PER_ROW - 1) {
            return true;
        }
        return false;
    }

    public boolean twoTogether() {
        for (int i = 0; i < NUM_ROWS; i++) {
            for (int n = 0; n < SEATS_PER_ROW-1; n++) {
                if (seats[i][n] == 0 && seats[i][n+1] == 0) {
                    return true;
                }
            }
        }
    }
    return false;
}

public int findAdjacent(int row, seatsNeeded) {
    for (int i = 0; i < SEATS_PER_ROW-seatsNeeded; i++) {
        boolean spotFound = true;
        if (seats[row][i] == 0) {
            for (int n = i+1; n < i + seatsNeeded; n++) {
                if (seats[row][n] == 1) {spotFound = false;}
            }
            if (spotFound) {return i}
        }
    }
    return -1;
}