
/**
 * Write a description of class MatrixMathDriver here.
 *
 * @author (Mr. Kim)
 * @version (October 28. 2019)
 */
import java.util.Arrays;
public class MatrixMathDriver
{
    public static void main(String[] args)
    {
        int[][] A=  { {1,2,3},{2,1,0},{1,0,2}};
        int[][] B = { {1,2,3,4,5}, {2,4,6,8,10}, {1,3,5,7,9}};
        int[][] C = { {-1,-2,-3},{-2,-3,-4},{4,3,5},{2,0,-1},{5,1,3} };
        
        System.out.println("*********************************************");
       
        MatrixMath mathA = new MatrixMath(A);	
        System.out.println("rowsumA is "+Arrays.toString(mathA.rowSum()));
        System.out.println("rowaveA is "+Arrays.toString(mathA.rowAve()));
        System.out.println("colsumA is "+Arrays.toString(mathA.colSum()));
        System.out.println("colaveA is" +Arrays.toString(mathA.colAve()));
        
        MatrixMath mathB = new MatrixMath(B);
        System.out.println("rowsumB is "+Arrays.toString(mathB.rowSum()));
        System.out.println("rowaveB is "+Arrays.toString(mathB.rowAve()));
        System.out.println("colsumB is "+Arrays.toString(mathB.colSum()));
        System.out.println("colaveB is" +Arrays.toString(mathB.colAve()));
        
        MatrixMath mathC = new MatrixMath(C);
        System.out.println("rowsumC is "+Arrays.toString(mathC.rowSum()));
        System.out.println("rowaveC is "+Arrays.toString(mathC.rowAve()));
        System.out.println("colsumC is "+Arrays.toString(mathC.colSum()));
        System.out.println("colaveC is" +Arrays.toString(mathC.colAve()));
    }
}
