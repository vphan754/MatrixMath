
/**
 * Write a description of class MatrixMath here.
 *
 * @author ( Mr. Kim)
 * @version ((October 28. 1029)
 */
public class MatrixMath
{
    // instance variables - replace the example below with your own
    private int[][] data;

    public MatrixMath(int[][] in)
    {
        data = in;
    }

    public int[] rowSum()
    {
        int[] result = new int[data.length];
        for (int i = 0; i<data.length; i++)
        {
            for (int j = 0; j<data[i].length; j++)
            {
                result[i]+=data[i][j];
            }
        }
        return result;
    }
    
    public double[] rowAve()
    {
        double[] result = new double[data.length];
        int[] rowSums = rowSum();
        
        for (int i = 0; i<rowSums.length; i++)
        {
            result[i] = rowSums[i]/(data[i].length*1.0d);
        }
        return result;
    }
    
    
    public int[] colSum()
    {
        int[] result = new int[data[0].length];
        
        //i = row number
        //j = column number
        
        for (int j = 0; j<data[0].length; j++)
        {
            for (int i = 0; i<data.length; i++)
            {
                result[j] += data[i][j];
            }
        }
        return result;
    }
    
    public double[] colAve()
    {
        double[] result = new double[data[0].length];
        int[] colSums = colSum();
        for (int i = 0; i<colSums.length; i++)
        {
            result[i]=colSums[i]/(data.length*1.0d);
        }
        return result;
    }
    
}
