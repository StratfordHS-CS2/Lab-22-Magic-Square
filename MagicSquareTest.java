import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test class for the MagicSquare class.
 *
 * @author Dave Avis
 * @version 3.4.2019
 */
public class MagicSquareTest
{
    /**
     * Testing isMagicSquare.
     */
    @Test(timeout=2000)
    public void isMagicSquareTest()
    {
        int numSquares = 6;
        int[] lengths = { 3, 3, 3, 4, 5, 5 };
        String[] squares = {
            "8 1 6 3 5 7 4 9 2",
            "6 1 8 7 5 3 2 9 4",
            "8 3 1 3 5 7 9 4 2",
            "7 12 1 14 2 13 8 11 16 3 10 5 9 6 15 4",
            "17 24 1 8 15 23 5 7 14 16 4 6 13 20 22 10 12 19 21 3 11 18 25 2 9",
            "17 24 1 8 5 23 5 7 14 6 4 6 13 20 2 10 12 19 21 3 11 18 25 2 9"
            };
        boolean[] expectedOutput = { true, true, false, true, true, false };


        for( int i = 0; i < numSquares; i++ )
        {
            MagicSquare m = new MagicSquare( lengths[i], squares[i] );
            assertEquals( "Testing Square (" + squares[i] + ") (-20 points)", expectedOutput[i], m.isMagicSquare() );
        }
    }

    /**
     * Testing sumRow
     */
    @Test(timeout=2000)
    public void sumRowTest()
    {
        MagicSquare m = new MagicSquare( 3, "1 2 3 4 5 6 7 8 9" );
        assertEquals( "sumRow failed (-14 points)", 6, m.sumRow(0) );
    }

    /**
     * Testing sumCol
     */
    @Test(timeout=2000)
    public void sumColTest()
    {
        MagicSquare m = new MagicSquare( 3, "1 2 3 4 5 6 7 8 9" );
        assertEquals( "sumCol failed (-14 points)", 12, m.sumCol(0) );
    }

    /**
     * Testing sumDownDiag
     */
    @Test(timeout=2000)
    public void sumDownDiagTest()
    {
        MagicSquare m = new MagicSquare( 3, "1 2 3 4 5 6 7 8 9" );
        assertEquals( "sumDownDiag failed (-14 points)", 15, m.sumDownDiag() );
    }

    /**
     * Testing sumUpDiag
     */
    @Test(timeout=2000)
    public void sumUpDiagTest()
    {
        MagicSquare m = new MagicSquare( 3, "1 2 3 1 2 3 1 2 3" );
        assertEquals( "sumUpDiag failed (-14 points)", 6, m.sumUpDiag() );
    }

    /**
     * Testing toString
     */
    @Test(timeout=2000)
    public void toStringTest()
    {
        MagicSquare m = new MagicSquare( 3, "1 2 3 4 5 6 7 8 9" );
        assertTrue( "toString failed (-14 points)", m.toString().length() > 0 );
    }
}
