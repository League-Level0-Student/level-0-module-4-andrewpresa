import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
	int story = JOptionPane.showOptionDialog(null, "Once upon a time there was a boy named Larry. Larry met Ken on the first day of school. They both got caught playing fortnite in class. They got sent to the pricipals office and saw the evil principals wenis. It was almost as crusty as the principals face, which was a", "Own Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Fat human face", "Like your dads face", "Octopus" }, null);
	
	if(story==0) {
		JOptionPane.showMessageDialog(null,"It was almost as crusty as the principals face, which was a fat human face");
		
	}
	else if(story==1) {
		JOptionPane.showMessageDialog(null, "It was almost as crusty as the principals face, which was like your dad's face");
	}
	else if(story==2) {
		JOptionPane.showMessageDialog(null, "It was almost as crusty as the principals face, which was a octopus");
	}
} String choice = JOptionPane.showInputDialog("(What is the principals favorite aniaml?)");
         
}