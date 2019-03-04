public class MagicSquare
{
    private int[][] mat;

    /**
     * Constructor - called when the MagicSquareRunner creates a new MagicSquare instance.
     * 
     * Size the matrix properly, then load the square from a string of numbers.
     * You do not need to edit this method.
     * 
     * @param size      the number of rows and columns in this square
     * @param numbers   the string containing the numbers in the square
     */
    public MagicSquare(int size, String numbers)
    {
        mat = new int[size][size];
        String[] s = numbers.split(" ");
        int k = 0;
        for( int i = 0; i < size; i++)
        {
            for( int j = 0; j < size; j++)
            {
                mat[i][j] = Integer.parseInt(s[k++]);
            }
        }
    }

    // return true if each row, column, and diagonal add up to the same number. false otherwise.
    public boolean isMagicSquare()
    {
        return false;
    }

    // return the sum of the specified row (rows start at 0 on the top)
    public int sumRow( int r )
    {
        return 0;
    }

    // return the sum of the specified column (columns start at 0 at the left)
    public int sumCol( int c )
    {
        return 0;
    }

    // return the sum of the diagonal that includes locations (0,0), (1,1), (2,2), etc...
    public int sumDownDiag()
    {
        return 0;
    }

    // return the sum of the diagonal that includes locations (assuming a 3x3 array) (2,0), (1,1), (0,2)
    public int sumUpDiag()
    {
        return 0;
    }

    // print the magic square as a square of numbers
    public String toString()
    {
        String output="";
        return output;
    }
}