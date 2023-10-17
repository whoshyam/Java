import javax.swing.JOptionPane;

public class L3_GUIintro {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter your name");
		// showInputDialog used for string
		JOptionPane.showMessageDialog(null, "Hello " + name);

		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
		// parseInt convert string into integer
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");

		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
		JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");
	}
}