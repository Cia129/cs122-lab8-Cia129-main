public class MagicSquare {

    static int[][] validMagicSquare = {{2,7,6},{9,5,1},{4,3,8}};
    static int[][] nonmagicSquare = {{4,3,5},{2,1,6},{7,8,9}};

   public static boolean checkRows(int[][] arr) {
        int n = arr.length;
        int[] sumList = new int[n];
        for( int row = 0; row < n; row++){
            int num = 0;
            for ( int col=0; col < n; col++){
                num += arr[row][col];
            }
            sumList[row] = num;
        }
        int magicNum = ((n*n*n +n) /2) ;
        for(int i = 1; i < n; i++) {
            
            if(sumList[i] != magicNum) return false;
        }

        return true;
    }

    public static boolean checkCols(int[][] list) {
        int n = list.length;
        int[] sumList = new int[n];
        for(int row = 0; row < n; row++){
            int num = 0;
            for ( int col = 0; col < n; col++){
                num += list[row][col];
            }
            sumList[row] = num;
        }
        int magicNum = ((n*n*n +n) /2) ;
        for(int i = 1; i < n; i++) {
            if(sumList[i] != magicNum) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int n = nonmagicSquare.length;
        int magicNum = ((n*n*n +n) /2) ;
        System.out.println("square");
        print2DArray(nonmagicSquare);
        System.out.println(checkCols(nonmagicSquare) && (checkRows(nonmagicSquare)) ? "This is a magic square !"+("The magic number is :")+ (magicNum) : "This is not a magic spuare" );
       
         n = validMagicSquare.length;
         magicNum = ((n*n*n +n) /2) ;
        System.out.println("square");
        print2DArray(validMagicSquare);
        System.out.println(checkCols(validMagicSquare) && (checkRows(validMagicSquare)) ? "This is a magic square !"+("The magic number is :")+ (magicNum) : "This is not a magic spuare" );
    }
    public static void print2DArray(int [][] array) {
        for( int i = 0; i < array.length; i++){
            for( int j = 0; j < array[i].length; j++ ){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();

        }
    }
    
}
 /*2 7 6
   9 5 1
   4 3 8
  */