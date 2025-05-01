import java.util.Scanner;

class CountOddNumbersInMatrix {
    public static int countOddNumbers(int[][] matrix, int m, int n){
        int oddCount = 0;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if(matrix[i][j]%2 != 0){
                    oddCount ++;
                }
            }
        }
        return oddCount;
    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int rows = read.nextInt();
        System.out.print("Enter the no of Columns: ");
        int columns = read.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter "+ rows*columns +" values of matrix");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                matrix[i][j] = read.nextInt();
            }
        }
        System.out.println("Number of odd numbers: "+countOddNumbers(matrix, rows, columns));
    }
}