package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		Random yeet = new Random ();
		int randomNumber = yeet.nextInt(4);
		String awesome = JOptionPane.showInputDialog("what is something you think is awesome");
		if(randomNumber==0) {
			JOptionPane.showMessageDialog(null, "i think that" + awesome + "is really cool also");
		}
		if(randomNumber==1) {
			JOptionPane.showMessageDialog(null, "eh," + awesome + "is ok i guess,");
		}
		if(randomNumber==2) {
			JOptionPane.showMessageDialog(null, "oh, i think that" + awesome + "is really boring");
		}
		if(randomNumber==3) {
			JOptionPane.showMessageDialog(null, "omg u flippin normie,"+ awesome + "is not memelord") ;
		}
		
		
	}
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	
	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0

	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1

	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2

	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3

	// -- write your own answer

}


