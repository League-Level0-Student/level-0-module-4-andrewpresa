import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
	String firecakes = JOptionPane.showInputDialog("What are your test scores?");
double grasscakes = Double.parseDouble(firecakes);
	if(grasscakes>=80) {
		JOptionPane.showMessageDialog(null, "Wow! You must have studied really hard for that test!");
	}
	else{JOptionPane.showMessageDialog(null,"YOU SUCK!");
	}
}
}
