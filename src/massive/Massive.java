/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package massive;

/**
 *
 * @author Admin
 */
public class Massive 
{
    public static void printMassive( int massive[] )
    {
        System.out.print( "[ " );
        for ( int i = 0; i < massive.length; i++ )        
            System.out.print( massive[i] + " " );
        
        System.out.print( "]" );
        System.out.println();
    }
    public static int find_1( int[] massive, int value )
    {
        for ( int i = 0; i < massive.length; i++ )        
            if ( massive[i] == value )
                return i;
        
        return -1;
    }
    public static int find_2( int[] massive, int value )
    {
        int i = 0;
        while ( i < massive.length )
        {
            if ( massive[i] == value )
                return i;
            
            i++;
        }
        
        return -1;
    }
    public static int find_3( int[] massive, int value )
    {
        int i = 0;
        do
        {
            if ( massive[i] == value )
                return i;
            
            i++;
        } while ( i < massive.length );
        
        return -1;
    }    
    public static int find_4( int[] massive, int value )
    {
        int result = -1;
        for ( int i = 0; i < massive.length; i++ )        
            if ( massive[i] == value )
            {
                result = i;
                break;
            }
        
        return result;
    }        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int massive[] = { 2, 3, 4, 5, 6, 6 };
        
        printMassive( massive );
        System.out.println( find_1( massive, 9 ) );
        System.out.println( find_1( massive, 4 ) );
        System.out.println();
        
        System.out.println( find_2( massive, 9 ) );
        System.out.println( find_2( massive, 4 ) );
        System.out.println();
        
        System.out.println( find_3( massive, 9 ) );
        System.out.println( find_3( massive, 4 ) );
        System.out.println();
        
        System.out.println( find_4( massive, 9 ) );
        System.out.println( find_4( massive, 4 ) );
        System.out.println();
    }
}