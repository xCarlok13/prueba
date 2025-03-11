package entornos;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class HolaMundo extends JFrame{
public HolaMundo(){
JLabel lblSaludo = new JLabel("Hola Mundo. Creando el primer ejemplo de Carlos Badia");
add(lblSaludo);
this.setSize(400,200);
this.setTitle("JFrame");
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
}
public static void main(String[] args) {
HolaMundo main = new HolaMundo();
}
}