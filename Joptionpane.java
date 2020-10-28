import javax.swing.JOptionPane;
public class Joptionpane{
	public static void main(String [] ar){
		int nota;
		String nombre;
		nombre=(JOptionPane.showInputDialog("Ingrese nombre del alumno :"));
		nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota :"));
		JOptionPane.showMessageDialog(null, nombre);
			if(nota >=4){
		JOptionPane.showMessageDialog(null, "aprobado");
			}else{
		JOptionPane.showMessageDialog(null, "reprobado");
		}
		System.out.println("Alfredihdz 28-Octubre-2020");
	}
}