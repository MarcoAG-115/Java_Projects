/* PalindromeClient
*  Anderson, Franceschi
*/

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Graphics;

public class PalindromeClient extends JFrame
{
 private Palindrome palind;
 boolean started = false;

 public PalindromeClient( )
 {
   palind = new Palindrome( );
   setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   setSize( 570, 400 );
   setVisible( true );
 }

 public Palindrome getPalindrome( )
 {
  return palind;
 }

 public void setStarted( boolean b )
 {
  started = b;
 }

 public boolean recursivePalindrome( String pal )
 {
   animate( pal );
   // Start of Student Work
   if ((pal.length() == 3) && (pal.substring(pal.length()-1).equalsIgnoreCase(pal.substring(0,1)))){
	   return true;
   }
   if (pal.substring(pal.length()-1).equalsIgnoreCase(pal.substring(0,1))){
	   return recursivePalindrome(pal.substring(0+2,pal.length()-1-1));
   }
   else{
	   return false;
   }
   // End of Student Work
 }

 public void animate( String pal )
 {
   palind.updatePalindrome( pal );
   palind.setStarted( true );
   started = true;
   repaint( );
   try
   {
       Thread.sleep( 1000 );      // wait for the animation to finish
   }
   catch ( Exception e )
   {
   }
 }

 public void paint( Graphics g )
 {
    if ( started )
    {
     super.paint( g );
     palind.draw( g );
    }
 }

 public String getPalString( )
 {
  boolean goodInput = false;
  String palString = "";
  // palString is limited to 26 characters
  while ( !goodInput )
  {
   try
   {
    palString = JOptionPane.showInputDialog( null, "Enter a word or phrase between 1 and 26 characters long" );
    if ( palString != null )
    {
     if ( palString.length( ) <= 26 && palString.length( ) >= 1 )
        goodInput = true;
    }
    else
    {
     System.exit( 0 );
    }
   }
   catch ( Exception e )
   { }
  }
  return palString;
 }

 public static void main( String [] args )
 {
   PalindromeClient app = new PalindromeClient( );
   // ask user for input
   boolean result = false;

   // the program will loop until the user clicks on "Cancel"
   while ( true )
   {
    String appPal = app.getPalString( );
    ( app.getPalindrome( ) ).setPalString( appPal );
    app.setStarted( true );
    // start
    result = app.recursivePalindrome( ( app.getPalindrome( ) ).getPalString( ) );
    // finish last step in animation
    ( app.getPalindrome( ) ).setResult( result );
    app.repaint( );
    System.out.println( "The correct result is " + ( app.getPalindrome( ) ).getExactResult( ) );
    System.out.println( "Your result is " + result );
    System.out.println( "Done\n" );
    // done
    JOptionPane.showMessageDialog( null, "Done" );
   }
 }
}
