package br.com.classes;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawSmiley extends JPanel { 
	
	// desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g)
	{
		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		
		int width = getWidth(); // largura total
		int height = getHeight(); // altrura local
		
		// desenha uma linha a partir do canto superior esquerdo ate o inferior direito
		g.drawLine(0, 0, width, height);
		
		// desenha uma linha a partir do canto inferior esquerdo ate o superior direito
		g.drawLine(0, height, width, 0);
		
	
	}
} // fim da classe DrawPanel


