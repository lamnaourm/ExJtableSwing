import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Principale extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo look : looks) {
            System.out.println(look.getClassName());
        }
        
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principale frame = new Principale();
					frame.setVisible(true);
					UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principale() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 366);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 31, 404, 219);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		ArrayList<Personne> p = new ArrayList<Personne>();
		p.add(new Personne("ppp1","dsds1",true,23));
		p.add(new Personne("ppp2","dsds2",false,24));
		p.add(new Personne("ppp3","dsds3",false,25));
		p.add(new Personne("ppp4","dsds4",true,26));
		table.setModel(new PersonneModel(p));
		
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(101, 261, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(229, 261, 89, 23);
		contentPane.add(btnNewButton_1);
	}

}
