package calc;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame {
	JTextField txtVisor = new JTextField();
	JButton btnMc = new JButton("Mc");
	JButton btnMr = new JButton("Mr");
	JButton btnMs = new JButton("Ms");
	JButton btnM = new JButton("M+");
	JButton btnm = new JButton("M-");
	JButton btnC = new JButton("C");
	JButton btnAD = new JButton("+/-");
	JButton btnR = new JButton("√");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btndiv = new JButton("/");
	JButton btnp = new JButton("%");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnmul = new JButton("*");
	JButton btnx = new JButton("1/x");
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnsub = new JButton("-");
	JButton btnigu = new JButton("=");
	JButton btn0 = new JButton("0");
	JButton btnvir = new JButton(",");
	JButton btnad = new JButton("+");
	
	
	JButton btnseta = new JButton("<--");
	JButton btnCe = new JButton("Ce");
	
	double n = 0;
	double i = 0;
	String operacao;
	public Calculadora(){
		super("Calculadora");
		 
		
		
		 Container paine = this.getContentPane(); // é uma classe responsavel pela fixação dos itens na tela
		 paine.add(txtVisor);
		 txtVisor.setBounds(20,20,245,40); // da direta pra esquerda, espaço de cima pra baixo , largura do objeto
		 
		 Calculo calc = new Calculo();
		 paine.add(btnMc);
		 btnMc.setBounds(20,80,51,51);
		 
		 paine.add(btnMr);
		 btnMr.setBounds(80,80,51,51);
		 
		 paine.add(btnM);
		 btnM.setBounds(200,80,51,51);
		 
		 paine.add(btnm);
		 btnm.setBounds(260,80,51,51);
		 
		 paine.add(btnMs);
		 btnMs.setBounds(140,80,51,51);
		 
		 paine.add(btnseta);
		 btnseta.setBounds(20,150,51,51);
		 
		 paine.add(btnCe);
		 btnCe.setBounds(80,150,51,51);
		 
		 paine.add(btnC);
		 btnC.setBounds(140,150,51,51);
		 
		 paine.add(btnAD);
		 btnAD.setBounds(200,150,51,51);
		 
		 
		 paine.add(btnR);
		 btnR.setBounds(260,150,51,51);
		 
		 paine.add(btn7);
		 btn7.setBounds(20,220,51,51);
		 btn7.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtVisor.setText(txtVisor.getText() + "7");
			 }
		 });
		 
		 paine.add(btn8);
		 btn8.setBounds(80,220,51,51);
		 btn8.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtVisor.setText(txtVisor.getText() + "8");
			 }
		 });
		 
		 paine.add(btn9);
		 btn9.setBounds(140,220,51,51);
		 btn9.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtVisor.setText(txtVisor.getText() + "9");
			 }
		 });
		 
		 paine.add(btndiv);
		 btndiv.setBounds(200,220,51,51);
		 btndiv.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				
				txtVisor.setText(txtVisor.getText());
				n = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = "div";
				
			 }
		 });
		 
		 paine.add(btnp);
		 btnp.setBounds(260,220,51,51);
		 
		 paine.add(btn4);
		 btn4.setBounds(20,290,51,51);
		 btn4.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtVisor.setText(txtVisor.getText() + "4");
			 }
		 });
		 
		 paine.add(btn5);
		 btn5.setBounds(80,290,51,51);
		 btn5.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtVisor.setText(txtVisor.getText() + "5");
			 }
		 });
		 
		 paine.add(btn6);
		 btn6.setBounds(140,290,51,51);
		 btn6.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtVisor.setText(txtVisor.getText() + "6");
			 }
		 });
		 
		 paine.add(btnmul);
		 btnmul.setBounds(200,290,51,51);
		 btnmul.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				
				txtVisor.setText(txtVisor.getText());
				n = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = "mult";
				
			 }
		 });
		 
		 paine.add(btnx);
		 btnx.setBounds(260,290,51,51);
		 
		 paine.add(btn1);
		 btn1.setBounds(20,360,51,51);
		 btn1.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtVisor.setText(txtVisor.getText() + "1");
			 }
		 });
		 
		 paine.add(btn2);
		 btn2.setBounds(80,360,51,51);
		 btn2.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtVisor.setText(txtVisor.getText() + "2");
			 }
		 });
		 
		 paine.add(btn3);
		 btn3.setBounds(140,360,51,51);
		 btn3.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtVisor.setText(txtVisor.getText() + "3");
			 }
		 });
		 
		 
		 paine.add(btnsub);
		 btnsub.setBounds(200,360,51,51);
		 btnsub.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				
				txtVisor.setText(txtVisor.getText());
				n = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = "sub";
				
			 }
		 });
		 
		 paine.add(btnigu);
		 btnigu.setBounds(260,360,51,120);
		 btnigu.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				i = Double.parseDouble(txtVisor.getText());
				 
				switch(operacao){ 
				case "soma": txtVisor.setText("" + calc.soma(n, i));
				break;
				
				case "sub":	txtVisor.setText("" + calc.sub(n, i));
				break;	 
						 
				case "div":txtVisor.setText("" + calc.div(n, i));
				break;		
							 
				case "mult":txtVisor.setText("" + calc.mult(n, i));
				break;			
						
				default:;
				break;
						
				
				}		
			 }});
		 
		 paine.add(btn0);
		 btn0.setBounds(20,430,110,51);
		 btn0.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 txtVisor.setText(txtVisor.getText() + "0");
			 }
		 });
		 
		 paine.add(btnvir);
		 btnvir.setBounds(140,430,51,51);
		 
		 paine.add(btnad);
		 btnad.setBounds(200,430,51,51);
		 btnad.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				
				txtVisor.setText(txtVisor.getText());
				n = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = "soma";
				
			 }
		 });
		 
		 
		 this.setLayout(null); // metodo responsavel por definir o posicionamento dos objetos no layout
		 this.setVisible(true); // responsavel por deixar a tela visivel
		 this.setSize(350,600); // dimensões da tela 
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Calculadora cal = new Calculadora();
		
		
		
	}
}
