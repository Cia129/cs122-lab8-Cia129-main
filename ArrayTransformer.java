public class ArrayTransformer {
    public static int [][] doubleit (int[][]list){
        for( int col = 0; col <list.length; col++){
            for(int row = 0; row < list[col].length; row++ ){
                int num = list[col][row];
                list[col][row] = num*num;
            }
        } 
        return list;
    }
    public static int[] sum (int [][]list){
       int[] sumList = new int[list.length];
       for( int col = 0; col <list.length; col++){
        int num = 0;
        for ( int row=0; row<list.length; row++){
            num += list[col][row];
        }
        sumList[col]= num;
       }
       return sumList;
    }
    public static int totalSum(int [][] list){
        int num = 0; 
        for (int col = 0; col<list.length; col++){
            for( int row=0; row<list.length; row++){
                num += list [col][row];
            }
        }
        return num;
    }
    public static int[][] transpose(int [][] list){
        int [][] newList = new int [list.length][list.length];
        for( int col = 0; col<list.length; col++){
            for( int row=0; row<list.length; row++){
                newList[row][col] = list[col][row];
            }
        }
        return newList;
    }
    public static void print2DArray(int [][] array) {
        for( int i = 0; i < array.length; i++){
            for( int j = 0; j < array[i].length; j++ ){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void printArray(int [] array) {
        for( int i = 0; i < array.length; i++){
                System.out.print(array[i]+ " ");
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        int[][] arr ={
        {1,2,3},
        {4,5,6},
        {7,8,9},
    };
    System.out.println("sum :");printArray(sum(arr));

    System.out.println("transpose: ");print2DArray(transpose(arr));

    System.out.println("double it : ");print2DArray(doubleit(arr));

    System.out.println("total sum: "+(totalSum(arr)));

}}
