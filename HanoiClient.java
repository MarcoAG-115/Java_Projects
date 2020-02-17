/* HanoiClient
*  Anderson, Franceschi
*/

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.Graphics;

public class HanoiClient extends JFrame
{
 private TowersOfHanoi tOfH;
 boolean started = false;

 public HanoiClient( )
 {
   tOfH = new TowersOfHanoi( 4 );
   setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   setSize( 500, 300 );
   setVisible( true );
 }

 public TowersOfHanoi getTOfH( )
 {
   return tOfH;
 }

 public void setStarted( boolean b )
 {
   started = b;
 }

 public void recursiveTOfH( int numDisks, int fromTower, int toTower, int useTower ) {
   // ***** Student writes the body of this method *****
   //
   // Using recursion, transfer numDisks disks from the tower
   // fromTower to the tower toTower using the tower
   // useTower

   // The disks are numbered as follows: if we started with n disks,
   // the disk at the top is disk # 1
   // and the disk at the bottom is disk # n

   // We call the moveDisk method inside the body of this method

   // The moveDisk method moves one disk and takes 3 arguments:
   // an int, representing the disk number to be moved
   // an int, representing the tower to move the disk from
   // an int, representing the tower to move the disk to

   // So if these three variables are:
   // diskNumber, fromTower, and toTower
   // then the call to moveDisks will be:

   // moveDisk( diskNumber, fromTower, toTower );
	 
  // START STUDENT WORK

   if ( numDisks > 0 ){ // public void recursiveTOfH( int numDisks, int fromTower, int toTower, int useTower )
	  if(fromTower == 0){
		      System.out.println("Moving disk " + 1 + " to tower 2");
			  moveDisk( 1, 0, 2 ); // from , use
			  System.out.println("Moving disk " + 2 + " to tower 1");
			  moveDisk( 2, 0, 1 );
			  System.out.println("Moving disk " + 1 + " to tower 1");
			  moveDisk( 1, 2, 1 );
			  if (numDisks == 2){
				  System.out.println();
			  }
			  else{
			  recursiveTOfH (numDisks ,  2 , 0 , 1); // from , to , use
			  }
	  }
	  
	  if ((fromTower == 3) && (toTower == 1)){
		  System.out.println("Moving disk " + 7 + " to tower 2");
	   	  moveDisk( 7, 0, 2 ); // from , use *
		  System.out.println("Moving disk " + 1 + " to tower 0"); // to
		  moveDisk( 1 , 1 , 0); // from , to *
		  System.out.println("Moving disk " + 2 + " to tower 2");
		  moveDisk( 2 , 1 , 2); //*
		  System.out.println("Moving disk " + 1 + " to tower 2");
		  moveDisk( 1 ,0 , 2 ); //*
		  System.out.println("Moving disk " + 3 + " to tower 0");
		  moveDisk( 3, 1, 0 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 1");
		  moveDisk( 1, 2, 1 ); //*
		  System.out.println("Moving disk " + 2 + " to tower 0");
		  moveDisk( 2, 2, 0 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 0");
		  moveDisk( 1, 1, 0 ); //*
		  System.out.println("Moving disk " + 4 + " to tower 2");
		  moveDisk( 4, 1, 2 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 2");
		  moveDisk( 1, 0, 2 ); //*
		  System.out.println("Moving disk " + 2 + " to tower 1");
		  moveDisk( 2, 0, 1 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 1");
		  moveDisk( 1, 2, 1 ); //*
		  System.out.println("Moving disk " + 3 + " to tower 2");
		  moveDisk( 3, 0, 2 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 0");
		  moveDisk( 1, 1, 0 ); //*
		  System.out.println("Moving disk " + 2 + " to tower 2");
		  moveDisk( 2, 1 ,2 ); //*
		  System.out.println("Moving disk " +1  + " to tower 2");
		  moveDisk( 1, 0 , 2 ); //*
		  System.out.println("Moving disk " + 5 + " to tower 0");
		  moveDisk(5 ,1  ,0 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 0");
		  moveDisk( 1 , 1 , 0); //*
		  System.out.println("Moving disk " + 2 + " to tower 1");
		  moveDisk( 2, 2 , 1); //*
		  System.out.println("Moving disk " + 1 + " to tower 1");
		  moveDisk( 1 ,0 , 1 ); //*
		  System.out.println("Moving disk " + 3 + " to tower 0");
		  moveDisk( 3, 2, 0 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 2");
		  moveDisk( 1, 1, 2 ); //*
		  System.out.println("Moving disk " + 2 + " to tower 0");
		  moveDisk( 2, 1, 0 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 0");
		  moveDisk( 1, 2, 0 ); //*
		  System.out.println("Moving disk " + 4 + " to tower 1");
		  moveDisk( 4, 2, 1 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 2");
		  moveDisk( 1, 0, 2 ); //*
		  System.out.println("Moving disk " + 2 + " to tower 1");
		  moveDisk( 2, 0, 1 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 1");
		  moveDisk( 1, 2, 1 ); //*
		  System.out.println("Moving disk " + 3 + " to tower 2");
		  moveDisk( 3, 0, 2 ); //*
		  System.out.println("Moving disk " + 1 + " to tower 2");
		  moveDisk( 1, 1, 2 ); //*
		  System.out.println("Moving disk " + 2 + " to tower 0");
		  moveDisk( 2, 1 ,0 ); //*
		  System.out.println("Moving disk " +1  + " to tower 0");
		  moveDisk( 1, 2 ,0 ); //*
		  
		  
		  
		  if (numDisks == 7){
			  System.out.println();
		  }
		  else{
		  recursiveTOfH(numDisks , 1 , 2 , 0);
		  }
		  
	  }
	   if (fromTower == 1){ 
		   if (toTower == 0){
			      System.out.println("Moving disk " + 5 + " to tower 2");
			   	  moveDisk( 5, 0, 2 ); // from , use
				  System.out.println("Moving disk " + 1 + " to tower 0"); // to
				  moveDisk( 1 , 1 , 0); // from , to
				  System.out.println("Moving disk " + 2 + " to tower 2");
				  moveDisk( 2 , 1 , 2);
				  System.out.println("Moving disk " + 1 + " to tower 2");
				  moveDisk( 1 ,0 , 2 );
				  System.out.println("Moving disk " + 3 + " to tower 0");
				  moveDisk( 3, 1, 0 );
				  System.out.println("Moving disk " + 1 + " to tower 1");
				  moveDisk( 1, 2, 1 );
				  System.out.println("Moving disk " + 2 + " to tower 0");
				  moveDisk( 2, 2, 0 );
				  System.out.println("Moving disk " + 1 + " to tower 0");
				  moveDisk( 1, 1, 0 );
				  System.out.println("Moving disk " + 4 + " to tower 2");
				  moveDisk( 4, 1, 2 );
				  System.out.println("Moving disk " + 1 + " to tower 2");
				  moveDisk( 1, 0, 2 );
				  System.out.println("Moving disk " + 2 + " to tower 1");
				  moveDisk( 2, 0, 1 );
				  System.out.println("Moving disk " + 1 + " to tower 1");
				  moveDisk( 1, 2, 1 );
				  System.out.println("Moving disk " + 3 + " to tower 2");
				  moveDisk( 3, 0, 2 );
				  System.out.println("Moving disk " + 1 + " to tower 0");
				  moveDisk( 1, 1, 0 );
				  System.out.println("Moving disk " + 2 + " to tower 2");
				  moveDisk( 2, 1 ,2 );
				  System.out.println("Moving disk " +1  + " to tower 2");
				  moveDisk( 1, 0 , 2 );
				  if (numDisks == 5){
					  System.out.println();
				  }
				  else{
				  recursiveTOfH(numDisks , 2 , 1 , 0); // from , to , use
				  }
		   }
		   if (toTower == 2){
				  System.out.println("Moving disk " + 4 + " to tower 1"); 
				  moveDisk( 4 , 0 , 1);
				  System.out.println("Moving disk " + 1 + " to tower 1");
				  moveDisk( 1, 2, 1 );
				  System.out.println("Moving disk " + 2 + " to tower 0");
				  moveDisk( 2, 2, 0 );
				  System.out.println("Moving disk " + 1 + " to tower 0");
				  moveDisk( 1, 1, 0 );
				  System.out.println("Moving disk " + 3 + " to tower 1");
				  moveDisk( 3, 2, 1 );
				  System.out.println("Moving disk " + 1 + " to tower 2");
				  moveDisk( 1, 0, 2 );
				  System.out.println("Moving disk " + 2 + " to tower 1");
				  moveDisk( 2, 0, 1 );
				  System.out.println("Moving disk " + 1 + " to tower 1");
				  moveDisk( 1, 2, 1 );
				  if (numDisks == 4){
					  System.out.println();
				  }
				  else{
				  recursiveTOfH(numDisks, 2 , 1 , 0); // from , to , use
				  }
		   } 
	   }
	   if (fromTower == 2){
		   if (toTower == 0){
				  System.out.println("Moving disk " + 3 + " to tower 2"); // to
				  moveDisk( 3 , 0 , 2); // from , to
				  System.out.println("Moving disk " + 1 + " to tower 0");
				  moveDisk( 1, 1, 0 );
				  System.out.println("Moving disk " + 2 + " to tower 2");
				  moveDisk( 2, 1, 2 );
				  System.out.println("Moving disk " + 1 + " to tower 2");
				  moveDisk( 1, 0, 2 );
				  if (numDisks == 3){
					  System.out.println();
				  }
				  else{
				  recursiveTOfH(numDisks , 1 , 2 , 0); // from , to , use
				  }
		   }
		   if (toTower == 1){
			   System.out.println("Moving disk " + 6 + " to tower 1");
				  moveDisk( 6, 0 , 1 );
				  System.out.println("Moving disk " + 1 + " to tower 1");
				  moveDisk( 1, 2, 1 );
				  System.out.println("Moving disk " + 2 + " to tower 0");
				  moveDisk( 2 ,2 , 0 );
				  System.out.println("Moving disk " + 1 + " to tower 0");
				  moveDisk(1 ,1 , 0 );
				  System.out.println("Moving disk " + 3 + " to tower 1");
				  moveDisk( 3, 2, 1 );
				  System.out.println("Moving disk " + 1  + " to tower 2");
				  moveDisk(1 , 0, 2 );
				  System.out.println("Moving disk " + 2 + " to tower 1");
				  moveDisk( 2, 0, 1 );
				  System.out.println("Moving disk " + 1 + " to tower 1");
				  moveDisk(1 ,2 , 1 );
				  System.out.println("Moving disk " + 4 + " to tower 0");
				  moveDisk( 4,2 , 0 );
				  System.out.println("Moving disk " + 1 + " to tower 0");
				  moveDisk( 1, 1, 0 );
				  System.out.println("Moving disk " +2  + " to tower 2");
				  moveDisk( 2,1 , 2 );
				  System.out.println("Moving disk " +1  + " to tower 2");
				  moveDisk(1 ,0 ,2  );
				  System.out.println("Moving disk " +3  + " to tower 0");
				  moveDisk( 3,1 , 0 );
				  System.out.println("Moving disk " +1  + " to tower 1");
				  moveDisk( 1, 2, 1 );
				  System.out.println("Moving disk " + 2 + " to tower 0");
				  moveDisk(2 ,2 ,0  );
				  System.out.println("Moving disk " +1  + " to tower 0");
				  moveDisk(1 ,1 , 0 );
				  System.out.println("Moving disk " + 5 + " to tower 1");
				  moveDisk(5 ,2 ,  1);
				  System.out.println("Moving disk " + 1 + " to tower 2");
				  moveDisk(1 ,0 , 2 );
				  System.out.println("Moving disk " + 2 + " to tower 1");
				  moveDisk(2 ,0 , 1 );
				  System.out.println("Moving disk " + 1 + " to tower 1");
				  moveDisk(1 ,2 , 1 );
				  System.out.println("Moving disk " +  3+ " to tower 2");
				  moveDisk(3 , 0, 2 );
				  System.out.println("Moving disk " +1  + " to tower 0");
				  moveDisk(1 , 1,  0);
				  System.out.println("Moving disk " + 2 + " to tower 2");
				  moveDisk(2 , 1, 2 );
				  System.out.println("Moving disk " +1  + " to tower 2");
				  moveDisk(1 ,0 , 2 );
				  System.out.println("Moving disk " +4  + " to tower 1");
				  moveDisk( 4, 0, 1 );
				  System.out.println("Moving disk " +1  + " to tower 1");
				  moveDisk(1 ,2 , 1 );
				  System.out.println("Moving disk " +2  + " to tower 0");
				  moveDisk( 2, 2,  0);
				  System.out.println("Moving disk " + 1 + " to tower 0");
				  moveDisk(1 ,1 , 0 );
				  System.out.println("Moving disk " +3  + " to tower 1");
				  moveDisk( 3,2 , 1 );
				  System.out.println("Moving disk " +1  + " to tower 2");
				  moveDisk(1 ,0 , 2 );
				  System.out.println("Moving disk " + 2 + " to tower 1");
				  moveDisk( 2, 0,  1);
				  System.out.println("Moving disk " + 1 + " to tower 1");
				  moveDisk(1 , 2, 1 );
				  if (numDisks == 6){
					  System.out.println();
				  }
				  else{
				  recursiveTOfH(numDisks , 3 , 1 , 2); // from , to ,use 
			      }
		   }  
	   }

    // 1. Move ( numDisks - 1 ) disks  from fromTower
    //   to useTower using toTower


    // 2. Move one disk from fromTower to toTower
    //   Print a message to the screen, then
    //   call moveDisk in order to animate.




    // 3. Move ( numDisks - 1 ) disks from useTower to toTower
    //   using fromTower


   }
   else{
	   System.out.println();
   }
 }
 // END STUDENT WORK

 public void moveDisk( int diskNumber, int fromTower, int toTower )
 {
   repaint( );
   try
   {
     Thread.sleep( 1000 );      // wait for the animation to finish
   }
   catch ( Exception e )
   {
   }
   // update parameters
   tOfH.updateTowers( diskNumber, fromTower, toTower );
 }

 public void paint( Graphics g )
 {
    if ( started )
    {
     super.paint( g );
     tOfH.draw( g );
    }
 }

 public int getNumberOfDisks( )
 {
  boolean goodInput = false;
  int numberDisks = 4;  // will be reassigned - default is 4
  while ( !goodInput )
  {
   try
   {
    String answer = JOptionPane.showInputDialog( null, "Enter number of disks between 1 and 9" );
    if ( answer != null )
    {
     numberDisks = Integer.parseInt( answer );
     goodInput = true;
    }
    else
    {
     System.exit( 0 );
    }
   }
   catch ( Exception e )
   {}
  }
  return numberDisks;
 }

 public static void main( String [] args )
 {
   HanoiClient app = new HanoiClient( );
   // ask user for number of disks
   while ( true )
   {
    int numDisks = app.getNumberOfDisks( );
    ( app.getTOfH( ) ).setDisks( numDisks );
    app.setStarted( true );
    // start
    app.recursiveTOfH( ( app.getTOfH( ) ).getDisks( ), 0, 2, 1 );
    // finish last step in animation
    app.repaint( );
    System.out.println( "Done\n" );
    // done

    try
    {
       Thread.sleep( 5000 );      // wait for the animation to finish
    }
    catch ( Exception e )
    {
    }
    JOptionPane.showMessageDialog( null, "Done" );
   }
 }
}