public class Task5 {

    public static void main(String[] args) {

        int SIZE=9;

        int [][] matrix = new int[SIZE][SIZE];
        //fill in zeroes
        for (int i = 0;i<SIZE;i++){
            for (int j=0;j<SIZE;j++){
                matrix [i][j]= 0;
            }
        }
        //fill in all "1"
        matrix [0][0] = 1;
        matrix [1][1] = 1;
        matrix [2][2] = 1;
        matrix [3][3] = 1;
        matrix [4][4] = 1;
        matrix [5][5] = 1;
        matrix [6][6] = 1;
        matrix [7][7] = 1;
        matrix [8][8] = 1;
        matrix [0][8] = 1;
        matrix [1][7] = 1;
        matrix [2][6] = 1;
        matrix [3][5] = 1;
        matrix [5][3] = 1;
        matrix [6][2] = 1;
        matrix [7][1] = 1;
        matrix [8][0] = 1;

        for (int i = 0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(matrix[i][j] +"\t");
            }
            System.out.println();
        }

    }


}
