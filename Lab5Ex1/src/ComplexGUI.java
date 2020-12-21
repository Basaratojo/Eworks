import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * @author pierrepaulcharbonnier
 *
 */
/**
 * @author pierrepaulcharbonnier
 *
 */
public class ComplexGUI {
	static double result;

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * variable int contains the size
		 */
		int size = 1000;
		/*
		 * Creating the frame , setting the size, setting a title
		 */
		JFrame frame = new JFrame();
		frame.setSize(size, size);
		frame.setTitle("Money Gang");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 * Creating the object of the class MoneyComponent that extends JComponent
		 */
		MoneyComponent component = new MoneyComponent();
		// add the component to the frame
		frame.add(component);
		/*
		 * Setting a layout to the component
		 */
		component.setLayout(new BorderLayout());
		/*
		 * Creating a textField
		 */
		JTextField textField = new JTextField();
		/*
		 * Creating a Panel called the north panel
		 */
		JPanel panelNorth = new JPanel();
		/*
		 * Putting a grid Layout inside
		 */
		panelNorth.setLayout(new GridLayout(1, 2));
		/*
		 * Adding the panelNorth to the component and fix this panel in the north
		 */
		component.add(panelNorth, BorderLayout.NORTH);
		/*
		 * Creating a label currency that is a fix text
		 */
		JLabel label = new JLabel("Currency");
		/*
		 * Adding this panel to the panelNorth then adding the textField too
		 */
		label.setHorizontalAlignment(SwingConstants.CENTER);
		panelNorth.add(label);
		panelNorth.add(textField);
		/*
		 * Creating a Panel called the panelCenter and putting a grid layout
		 */
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new GridLayout(3, 2));
		/*
		 * creating the first comboBox
		 */

		JComboBox<String> combo1Begin = new JComboBox<String>();
		combo1Begin.addItem("EUR");
		combo1Begin.addItem("USD");
		combo1Begin.addItem("GBP");
		// set editable is there to do not modify the comboBox
		combo1Begin.setEditable(false);
		/*
		 * creating the second comboBox
		 */
		JComboBox<String> combo2End = new JComboBox<String>();
		combo2End.addItem("EUR");
		combo2End.addItem("USD");
		combo2End.addItem("GBP");
		// set editable is there to do not modify the comboBox
		combo2End.setEditable(false);
		// Adding the panelCenter to the component and fix this panel in the center
		component.add(panelCenter, BorderLayout.CENTER);
		/*
		 * Creating the label with a text(begin), then adding to label1 and combo1Begin
		 */
		JLabel label1 = new JLabel("Chose beteen the tree kind of money for the initial amount");
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		panelCenter.add(label1);
		panelCenter.add(combo1Begin);
		/*
		 * Creating the label with a text(end), then adding to label2 and combo2End
		 */
		JLabel label2 = new JLabel("Chose your converting kind of money");
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		panelCenter.add(label2);
		panelCenter.add(combo2End);
		/*
		 * creating the convert button and adding it
		 */
		JButton buttonConvert = new JButton("Click me to convert");
		panelCenter.add(buttonConvert);
		JLabel label3 = new JLabel();
		/*
		 * creating the Action listener that convert when we press on the button
		 * (buttonConvert)
		 */
		ActionListener convert = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String textD = textField.getText();
				short begin = (short) combo1Begin.getSelectedIndex();
				short end = (short) combo2End.getSelectedIndex();

				double amount = Double.parseDouble(textD);
				short symBegin = begin;
				short symEnd = end;
				result = makeConvertion(amount, symBegin, symEnd);
// putting the limits to decimal
				DecimalFormat df = new DecimalFormat("#.##");
				String dx = df.format(result);
				if (symBegin == symEnd) {
					label3.setText("YOUR NUMBER IS " + dx + " WARNING THE TWO CURRENCY ARE THE SAME ! ");

				} else
					label3.setText(dx);
			}

		};
		// adding the actionlistener to the buttonConvert
		buttonConvert.addActionListener(convert);
		// setting the last fixtext
		label3.setText("result");
		label3.setHorizontalAlignment(SwingConstants.CENTER);

		component.add(panelCenter, BorderLayout.CENTER);
		panelCenter.add(label3);
// set the frame visible F
		frame.setVisible(true);

	}

	/**
	 * method that make the convention
	 * 
	 * @param amount
	 * @param symBegin
	 * @param symEnd
	 * @return
	 */
	protected static double makeConvertion(double amount, short symBegin, short symEnd) {

		if (symBegin == 0 && symEnd == 1)
			return amount * 1.18;
		else if (symBegin == 0 && symEnd == 2)
			return amount * (1 / 1.12);
		else if (symBegin == 0 && symEnd == 0)
			return amount;
		else if (symBegin == 1 && symEnd == 0)
			return amount * (1 / 1.18);
		else if (symBegin == 1 && symEnd == 2)
			return amount * (1 / 1.32);
		else if (symBegin == 1 && symEnd == 1)
			return amount;
		else if (symBegin == 2 && symEnd == 0)
			return amount * 1.12;
		else if (symBegin == 2 && symEnd == 1)
			return amount * 1.32;
		else
			return amount;

	}

}
