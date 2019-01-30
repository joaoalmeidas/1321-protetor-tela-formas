import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

import javax.swing.JPanel;
import javax.swing.Timer;

public class ProtetorDeTela extends JPanel implements ActionListener{
	
	private final SecureRandom aleatorio = new SecureRandom();
	private Timer tempo ;
	private int limite;
	
	public ProtetorDeTela(int limite){
		
		tempo = new Timer(1000, this);
		tempo.start();
		this.limite = limite;
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		
		for(int i = 0; i < limite; i++) {
			
			g.setColor(new Color(aleatorio.nextInt(256), aleatorio.nextInt(256), aleatorio.nextInt(256)));
			g.drawLine(aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()), aleatorio.nextInt(getWidth()), aleatorio.nextInt(getHeight()));
			
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		repaint();
		
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	
}
