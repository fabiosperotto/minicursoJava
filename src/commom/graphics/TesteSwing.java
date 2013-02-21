package commom.graphics;

import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TesteSwing extends JFrame{
	
	private JButton botao1, botao2;
	private JLabel etiqueta1, etiqueta2;
	private JTextField campoTexto1, campoTexto2;
	private JPanel janela;
	
	public TesteSwing(){
		super("Testando Swing");
	}

	public void criarJanela(){
		
		etiqueta1 = new JLabel("Etiqueta 1");
		etiqueta1.setBounds(new Rectangle(10,20,60,25));
		
		campoTexto1 = new JTextField("Escreva aqui");
		campoTexto1.setBounds(new Rectangle(70,20,90,25));
		
		botao1 = new JButton("Click me");
		botao1.setBounds(new Rectangle(160,20,90,25));
		
		botao2 = new JButton("Hi");
		botao2.setBounds(new Rectangle(80,80,50,25)); //X,Y,L,A
		
		janela = new JPanel();
		janela.setLayout(null);
		
		janela.add(etiqueta1);
		janela.add(campoTexto1);
		janela.add(botao1);
		janela.add(botao2);
		
		this.getContentPane().add(janela);
		//this.pack();
		this.setSize(320,400); //X,Y
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		TesteSwing sistema = new TesteSwing();
		sistema.criarJanela();
	}
	
}
