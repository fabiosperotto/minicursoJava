package commom.graphics;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TesteSwing extends JFrame implements ActionListener{
	
	private JButton botao1, botao2;
	private JLabel etiqueta1, etiqueta2;
	private JTextField campoTexto1, campoTexto2;
	private JPanel janela;
	private JMenuBar barraFerramentas;
	private JMenu menu1, menu2;
	private JMenuItem menuItem1, menuItem2;
	
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
		botao1.addActionListener(this);
		
		botao2 = new JButton("Hi");
		botao2.setBounds(new Rectangle(80,80,50,25)); //X,Y,L,A
		
		//CRIACAO MENUBAR
		barraFerramentas = new JMenuBar();
		
		menu1 = new JMenu("Arquivo");
		menu1.setMnemonic(KeyEvent.VK_A);
		barraFerramentas.add(menu1);
		
		menu2 = new JMenu("Ajuda");
		menu2.setMnemonic(KeyEvent.VK_J);
		barraFerramentas.add(menu2);
		
		menuItem1 = new JMenuItem("Novo",KeyEvent.VK_N);
		menu1.add(menuItem1);
		
		menuItem2 = new JMenuItem("Sobre");
		menuItem2.setMnemonic(KeyEvent.VK_S);
		menu2.add(menuItem2);
		//FIM CRIACAO MENUBAR
		
		janela = new JPanel();
		janela.setLayout(null);
		
		janela.add(etiqueta1);
		janela.add(campoTexto1);
		janela.add(botao1);
		janela.add(botao2);
		
		this.setJMenuBar(barraFerramentas);
		this.getContentPane().add(janela);
		//this.pack();
		this.setSize(320,400); //X,Y
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent evento){
		
		Object acao = evento.getSource();
		
		if(acao == botao1){
			campoTexto1.setText("clicado");
			
		}
		
	}
	
	public static void main(String[] args) {
		TesteSwing sistema = new TesteSwing();
		sistema.criarJanela();
	}
	
}
