import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.next());
        int m = Integer.parseInt(input.next());
        int moveNum = 2 * n * m - m - n;
        int[][] moves = new int[moveNum][4];
        for (int i = 0; i < moveNum; i++) {
            for (int j = 0; j < 4; j++) {
                moves[i][j] = Integer.parseInt(input.next());
            }
        }
        input.close();

        int[][] result = new int[n][m];
        int a = 0;
        int b = 0;
        boolean turn = true; // true for a
        for (int i = 0; i < moveNum; i++) {
            if (moves[i][0] == moves[i][2]) {
                if (moves[i][1] < moves[i][3]) {
                    if (moves[i][0] != 1) {
                        result[moves[i][0] - 2][moves[i][1] - 1]++;
                    }
                    if (moves[i][0] != n + 1) {
                        result[moves[i][0] - 1][moves[i][1] - 1]++;
                    }
                }
                else {
                    if (moves[i][0] != 1) {
                        result[moves[i][0] - 2][moves[i][3] - 1]++;
                    }
                    if (moves[i][0] != n + 1) {
                        result[moves[i][0] - 1][moves[i][3] - 1]++;
                    } 
                }
            }
            else {
                if (moves[i][0] < moves[i][2]) {
                    if (moves[i][1] != 1) {
                        result[moves[i][0] - 1][moves[i][1] - 2]++;
                    }
                    if (moves[i][1] != n + 1) {
                        result[moves[i][0] - 1][moves[i][1] - 1]++;
                    }
                }
                else {
                    if (moves[i][1] != 1) {
                        result[moves[i][2] - 1][moves[i][3] - 2]++;
                    }
                    if (moves[i][1] != n + 1) {
                        result[moves[i][2] - 1][moves[i][3] - 1]++;
                    } 
                }
            }
            
            int point = check(n, m, result);
            if (point != 0) {
                if (turn) {
                    a += point;
                }
                else {
                    b += point;
                }
            }
            else {
                turn = !turn;
            }    
        }
        System.out.println(a + " " + b);
    }

    public static int check(int n, int m, int[][] result) {
        int res = 0;
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < m; j++) {
                if (result[k][j] == 4) {
                    res++;
                    result[k][j]++;
                }
            }
        }
        return res;
    }
}