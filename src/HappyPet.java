import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String Pet = JOptionPane.showInputDialog("What kind of pet do you want to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
for (int i = 0; i < 5; i++) {
			int task = JOptionPane.showOptionDialog(null, "Cuddle, Food, or Water?", "Activity with your pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "Water" }, null);

	
	

			// 5. Use user input to call the appropriate method created in step 4.
if(task==0) {
	happinessLevel++;
	cuddle();
	
	
}
else if(task==1) {
	happinessLevel++;
	food();

}
else if(task==2) {
	happinessLevel++;
	water();

}
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
JOptionPane.showMessageDialog(null, "Your pets happiness level is at maximum height, you really love your pet and you deserve a break.");
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void cuddle() {
		JOptionPane.showMessageDialog(null, "your pet likes that, happiness level is at " +happinessLevel);
		
		
	
	
	}
	public static void food() {
		JOptionPane.showMessageDialog(null, "they really are hungry, happiness level is at " +happinessLevel);
		
	}
	public static void water() {
		JOptionPane.showMessageDialog(null, "Your boy is thristy, happiness level is at" +happinessLevel);
		
	}
	}
	

