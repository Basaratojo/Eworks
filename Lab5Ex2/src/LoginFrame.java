import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author pierrepaulcharbonnier
 *
 */
public class LoginFrame {
	/**
	 * @username string arrays
	 * @password string arrays
	 * @counter the counter for the fails
	 * @numberOfAccount
	 */
	static private String[] username = new String[] { "Account1", "Account2" };
	static private String[] password = new String[] { "password1", "password2" };
	static private short counter = 0;
	static private short numberOfAccount = (short) username.length;

	public static void main(String[] args) {
		// setting all the frame
		JFrame frame = new JFrame();
		int width = 300;
		int larg = 130;
		frame.setSize(width, larg);
		frame.setTitle("LOGIN PAGE");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// creating the component
		JComponent component = new JComponent() {
			private static final long serialVersionUID = 1L;
		};
		// adding the component
		frame.add(component);
		GridLayout gridLayout = new GridLayout(3, 2);
		component.setLayout(gridLayout);
		// creating the two label
		JLabel jLabel1 = new JLabel(" The user name ~ ");
		JLabel jLabel2 = new JLabel(" The password ~ ");
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		// Creating two text field
		JTextField userName = new JTextField();
		JPasswordField passWord = new JPasswordField();
		userName.setHorizontalAlignment(SwingConstants.CENTER);
		passWord.setHorizontalAlignment(SwingConstants.CENTER);
		// Creating the button to login
		JButton loginButton = new JButton("login");
		loginButton.setHorizontalAlignment(SwingConstants.CENTER);
		// adding all of them
		component.add(jLabel1);
		component.add(userName);
		component.add(jLabel2);
		component.add(passWord);
		component.add(loginButton);

		// creating the action listener
		ActionListener presserLogin = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Getting the text inside those textfield
				String textUser = userName.getText();
				String textPass = new String(passWord.getPassword());
				// implementing the counter
				counter++;
				// checking all the account with all the password
				for (int i = 0; i < numberOfAccount; i++) {
					if (textUser.equalsIgnoreCase(username[i]) && textPass.equals(password[i])) {
						welkome();

					}
				}
				// stopping the login
				if (3 < counter) {
					error();
				}

				fails();

			}

		};
		// adding the listener to the button
		loginButton.addActionListener(presserLogin);
		System.err.println(counter);
		frame.setVisible(true);

	}

	/**
	 * method that show a welcome message
	 */
	public static void welkome() {
		JOptionPane.showMessageDialog(null, "Welkome inside your account ", "", 1);
		System.exit(1);
	}

	/**
	 * method that show a error message and block your account and stop the program
	 */
	public static void error() {
		JOptionPane.showMessageDialog(null, " You have tried more then 3 times!Your account is blocked. ", "", 1);
		System.exit(1);
	}

	/**
	 *  method that show a fails message 
	 */
	public static void fails() {
		JOptionPane.showMessageDialog(null, " Username/Password is not correct! ", "", 1);
	}

}
