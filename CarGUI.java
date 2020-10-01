package Question3;
//stefan evers c17707801
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class CarGUI {

	private JFrame f;
	private JTextField t1, t2, t3;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {

				CarGUI window = new CarGUI();
				window.f.setVisible(true);

			}
		});
	}

	public CarGUI() {
		init();
	}

	private void init() {
		ArrayList<Car> carlist = new ArrayList<Car>();

		f = new JFrame();

		f.setBounds(100, 100, 600, 400);

		f.getContentPane().setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel l1 = new JLabel("Car Make:");
		l1.setBounds(60, 50, 100, 10);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("Car Model:");
		l2.setBounds(60, 90, 90, 10);
		f.getContentPane().add(l2);

		JLabel l3 = new JLabel("Registration Year:");
		l3.setBounds(60, 135, 100, 10);
		f.getContentPane().add(l3);

		JTextArea t1 = new JTextArea();
		t1.setBounds(164, 175, 431, 89);
		f.getContentPane().add(t1);

		JLabel l4 = new JLabel("Car Info:");
		l4.setBounds(60, 200, 100, 10);
		f.getContentPane().add(l4);

		t2 = new JTextField();
		t2.setColumns(15);
		t2.setBounds(160, 40, 430, 20);
		f.getContentPane().add(t1);

		t3 = new JTextField();
		t3.setColumns(15);
		t3.setBounds(150, 60, 430, 20);
		f.getContentPane().add(t3);

		JTextField t8 = new JTextField();
		t8.setColumns(15);
		t8.setBounds(165, 130, 430, 20);
		f.getContentPane().add(t8);

		JButton b1 = new JButton("Create");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Car c = new Car();
				c.setCarMake(t1.getText());
				c.setCarModel(t2.getText());
				c.setRegistrationYear(t3.getText());
				carlist.add(c);
			}
		});
		b1.setBounds(100, 310, 90, 20);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("Display");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (Car x : carlist) {
					System.out
							.println("Make :" + x.getCarMake() + " Model :" + x.getCarModel() + " Reg : " + x.getReg());

				}
			}
		});
		b2.setBounds(250, 300, 90, 20);
		f.getContentPane().add(b2);
	}
}
