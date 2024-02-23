import java.awt.*; 
import javax.swing.*;
class ventanaInicio extends JFrame{
	
	GridBagLayout gbl1 = new GridBagLayout(), gbl2 = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	JPanel panel1;
	
	public void localizador(int x, int y, int w, int h, int f) {
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.gridwidth=w;
		gbc.gridheight=h;
		gbc.fill=f;
	}//Metodo loc
	
	public void agregar(Component c,  int r) {
		if(r == 1) {
			gbl1.setConstraints(c, gbc);	
			add(c);
		}
		else if(r == 2) {
			gbl2.setConstraints(c, gbc);
			panel1.add(c);	
		}
	
	}//Metodo añadir
	
	//============================================
	public ventanaInicio() {
		getContentPane().setLayout(gbl1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("FormularioV2");
		setVisible(true);
		//==============================================
		JLabel lbl1 = new JLabel("....");
		localizador(0,0,2,1, GridBagConstraints.HORIZONTAL);
		agregar(lbl1,1);
		
		JLabel lbl2 = new JLabel("....");
		localizador(0,1,2,1, GridBagConstraints.HORIZONTAL);
		agregar(lbl2,1);
		
		JLabel lbl3 = new JLabel(" ");
		localizador(0,0,2,1, GridBagConstraints.HORIZONTAL);
		agregar(lbl3,1);
		
		JLabel lbl4 = new JLabel("....");
		localizador(0,0,2,1, GridBagConstraints.HORIZONTAL);
		agregar(lbl4,1);
		
		JLabel lbl5 = new JLabel("Include the following:");
		localizador(0, 5, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl5, 1);
		
		JCheckBox cb1 = new JCheckBox("a title for you form");
		localizador(0, 6, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(cb1, 1);
		
		JTextField caja1 = new JTextField();
		localizador(0, 7, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(caja1, 1);
		
		JLabel lbl02 = new JLabel(" ");
		localizador(0, 8, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl02, 1);
		
		ButtonGroup btng = new ButtonGroup();
		JRadioButton rad1 = new JRadioButton("only required fields");
		btng.add(rad1);
		localizador(0, 9, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(rad1, 1);
		
		JRadioButton rad2 = new JRadioButton("all fields");
		btng.add(rad2);
		localizador(0, 10, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(rad2, 1);
		
		JLabel lbl6 = new JLabel("   (edit required fields in the form builder)");
		localizador(0, 11, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl6, 1);
		
		JLabel lbl7 = new JLabel(" ");
		localizador(0, 12, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl7, 1);
		
		JCheckBox cb2 = new JCheckBox("interest group fields");
		localizador(0, 13, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(cb2, 1);
		
		JCheckBox cb3 = new JCheckBox("required field indicators");
		localizador(0, 14, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(cb3, 1);
		
		JLabel lbl04 = new JLabel(" ");
		localizador(0, 15, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl04, 1);
		
		JLabel lbl8 = new JLabel("Set form width");
		localizador(0, 16, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl8, 1);
		
		JTextField txt2 = new JTextField();
		localizador(0, 17, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(txt2, 1);
		
		JLabel lbl9 = new JLabel(" ");
		localizador(0, 18, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl9, 1);
		
		JLabel lbl10 = new JLabel("Enhance your form");
		localizador(0, 19, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl10, 1);
		
		JCheckBox cb4 = new JCheckBox("eneable evil popup mode");
		localizador(0, 20, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(cb4, 1);
		
		JCheckBox cb5 = new JCheckBox("disable all JavaScript (i)Info");
		localizador(0, 21, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(cb5, 1);
		
		JCheckBox cb6 = new JCheckBox("include archive link (i)Info");
		localizador(0, 22, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(cb6, 1);
		
		JCheckBox cb7 = new JCheckBox("include MonkeyRewards link");
		localizador(0, 23, 2, 1, GridBagConstraints.HORIZONTAL);
		agregar(cb7, 1);
				
		JLabel lbl11 = new JLabel("         ");
		localizador(2, 0, 1, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl11, 1);
		
		JLabel lbl12 = new JLabel("Preview");
		lbl9.setFont(new Font("Arial", Font.BOLD, 16));
		localizador(3, 0, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl12, 1);
		
		
		panel1 = new JPanel();
		panel1.setLayout(gbl2);
		panel1.setBackground(new Color(200, 200, 200));
		localizador(3, 1, 4, 9, GridBagConstraints.BOTH);
		gbc.fill = GridBagConstraints.VERTICAL;
		agregar(panel1, 1);
		

		JLabel lbl13 = new JLabel("                                                                                                                                    ");
		localizador(0, 0, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl13, 2);
		
		JLabel lbl14 = new JLabel("Email Address");
		localizador(0, 1, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl14, 2);
		
		JTextField txt3 = new JTextField();
		localizador(0, 2, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(txt3, 2);
		
		JLabel lbl15 = new JLabel("First Name");
		localizador(0, 3, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl15, 2);
		
		JTextField txt4 = new JTextField();
		localizador(0, 4, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(txt4, 2);
		
		JLabel lbl16 = new JLabel("Last Name");
		localizador(0, 5, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl16, 2);
		
		JTextField caja5 = new JTextField();
		localizador(0, 6, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(caja5, 2);
		
		JButton btn1 = new JButton("Suscribe");
		localizador(0, 7, 4, 1, 0);
		gbc.anchor = GridBagConstraints.WEST;
		agregar(btn1, 2);
		
		JLabel lbl07 = new JLabel(" ");
		localizador(0, 8, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl07, 2);
		
		JLabel lbl08 = new JLabel(" ");
		localizador(0, 10, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl08, 1);
		
		JLabel lbl17 = new JLabel("Copy/paste onto your site");
		localizador(3, 11, 4, 1, GridBagConstraints.HORIZONTAL);
		agregar(lbl17, 1);
		
		JTextArea a1 = new JTextArea();
		localizador(3, 12, 4, 8, GridBagConstraints.BOTH);
		a1.setText("enter the text....");
		a1.setLineWrap(true);
		a1.setWrapStyleWord(true);
		agregar(a1, 1);
		
		pack();
				
		System.gc();
		
		
	}//Constructor
	
	
}//clase
public class Prueba {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ventanaInicio();
			}
		});

	}

}
