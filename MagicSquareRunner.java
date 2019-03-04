/**
 * This is the runner class for the MagicSquare class.
 * You do not need to edit this file.
 * 
 * @author Dave Avis
 * @version 3.4.2019
 */
public class MagicSquareRunner
{
    public static void main( String[] args )
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

        for( int i = 0; i < numSquares; i++ ){
            MagicSquare m = new MagicSquare( lengths[i], squares[i] );
            m.toString();
            if( m.isMagicSquare() )
            {
                System.out.println( "MAGIC SQUARE" );
            } else {
                System.out.println( "NOT A MAGIC SQUARE" );
            }
        }
    }
}