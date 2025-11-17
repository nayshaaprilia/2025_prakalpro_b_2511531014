package pekan8_2511531014;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511531014 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.WARNING_MESSAGE);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511531014 frame = new OperatorAritmatikaGUI_2511531014();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUI_2511531014() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 302);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtBil1 = new JTextField();
		txtBil1.setColumns(10);
		txtBil1.setBounds(82, 84, 96, 20);
		contentPane.add(txtBil1);
		
		txtBil2 = new JTextField();
		txtBil2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int hasil = 0;

				if (txtBil1.getText().trim().isEmpty()) {
				    pesanPeringatan("Bilangan 1 harus diisi");
				} else if (txtBil2.getText().trim().isEmpty()) {
				    pesanPeringatan("Bilangan 2 harus diisi");
				} else {
				    try {
				        int a = Integer.parseInt(txtBil1.getText());
				        int b = Integer.parseInt(txtBil2.getText());
				        int c = comboBox.getSelectedIndex(); 

				        if (c == 0) {
				            hasil = a + b;
				        }
				        if (c == 1) {
				            hasil = a - b;
				        }
				        if (c == 2) {
				            hasil = a * b;
				        }
				        if (c == 3) {
				            hasil = a / b;
				        }
				        if (c == 4) {
				            hasil = a % b;
				        }

				    } catch (NumberFormatException ex) {
				        pesanEror("Bilangan 1 dan Bilangan 2 harus angka");
				    }
					txtHasil.setText(String.valueOf(hasil));
				}

				btnNewButton.setBounds(219, 119, 88, 22);
				contentPane.add(btnNewButton);
			}
		});
		
		JLabel lblNewLabel = new JLabel("Bilangan 1");
		
		JLabel lblBilangan = new JLabel("Bilangan 2");
		
		JLabel lblHasil = new JLabel("Hasil");
		
		JLabel lblOperatorAritmatika = new JLabel("OPERATOR ARITMATIKA");
		
		JLabel lblOperator = new JLabel("Operator");
		
		txtHasil = new JTextField();
		txtHasil.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblNewLabel)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblOperator)
								.addComponent(lblBilangan)))
						.addComponent(lblHasil))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(txtBil1, 0, 0, Short.MAX_VALUE)
						.addComponent(txtBil2, 0, 0, Short.MAX_VALUE)
						.addComponent(txtHasil, 0, 0, Short.MAX_VALUE)
						.addComponent(comboBox, 0, 43, Short.MAX_VALUE))
					.addGap(29)
					.addComponent(btnNewButton)
					.addContainerGap(277, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(192, Short.MAX_VALUE)
					.addComponent(lblOperatorAritmatika)
					.addGap(186))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblOperatorAritmatika)
							.addGap(18)
							.addComponent(txtBil1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtBil2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBilangan))
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton)
						.addComponent(lblOperator))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(txtHasil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblHasil))
					.addContainerGap(64, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);

	}
}