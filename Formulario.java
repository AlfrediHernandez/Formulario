import javax.swing.*;
import java.awt.event.*;
public class Formulario extends JFrame implements ActionListener{
	private JTextField textfield;
	private JLabel label;
	private JButton boton;
public Formulario(){
		setLayout(null);
		label = new JLabel("usuario: ");
		label.setBounds(10,10,100,30);
		add(label);

		textfield = new JTextField();
		textfield.setBounds(120,17,150,20);
		add(textfield);

		boton = new JButton("aceptar");
		boton.setBounds(10,80,100,30);
		add(boton);
		boton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton){
			String texto = textfield.getText();
			setTitle(texto);
		}
	}
	public static void main(String [] ar){
		Formulario form = new Formulario();
		form.setBounds(0,0,300,150);
		form.setDefaultCloseOperation(3);
		form.setVisible(true);
		form.setLocationRelativeTo(null);
		form.setResizable(false);
	}
}