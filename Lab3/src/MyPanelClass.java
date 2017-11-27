import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import javax.swing.JPanel;
import java.awt.Rectangle;

public class MyPanelClass extends JPanel {
	private static final long serialVersionUID = 7057541440811488699L;
	
	public void paintComponent(Graphics g) {
		super.paintComponent (g);
		//Compute interior coordinates
		Insets myInsets = this.getInsets();
		int x1 = myInsets.left;
		int y1 = myInsets.top;
		int x2 = getWidth() - myInsets.right - 1;
		int y2 = getHeight() - myInsets.bottom - 1;
		int width = x2 - x1;
		int height = y2 - y1;
		
		//Paint the background
		//g.setColor(Color.LIGHT_GRAY);
		//g.fillRect(x1, y1, width + 1, height + 1);
		
		//Draw a border
		//g.setColor(Color.YELLOW);
		//g.drawRect(x1, y1, width, height);
		
		//Draw a second border
		//g.setColor(Color.BLACK);
		//g.drawRect(x1 + 5, y1 + 5, width - 10, height - 10);
		
		//Draws a diagonal line \
		//g.setColor(Color.WHITE);
		//g.drawLine(x1, y1, x2, y2);
		
		//Draw a second Diagonal line/
		//g.setColor(Color.GREEN);
		//g.drawLine(x1 + width, y1 + 5, x2 - width, y2);
		
		//Draws an Oval O
		//g.setColor(Color.ORANGE);
		//g.drawOval(x1, y1, width, height); //draws an empty oval
		//g.fillOval((getWidth()-55)/2), ((getHeight()-55)/2), 55, 55);
		
//		Polygon p = new Polygon();//Arrow
//		p.addPoint(x1 + 5, y1 + 25);
//		p.addPoint(x1 + 20, y1 + 10);
//		p.addPoint(x1 + 35, y1 + 25);
//		p.addPoint(x1 + 25, y1 + 25);
//		p.addPoint(x1 + 25, y1 + 45);
//		p.addPoint(x1 + 15, y1 + 45);
//		p.addPoint(x1 + 15, y1 + 25);
//		g.setColor(Color.BLACK);
//		g.fillPolygon(p);
//		
//		Polygon p2 = new Polygon(); //Star
//		p2.addPoint(x1 + 25, y1 + 73);
//		p2.addPoint(x1 + 41, y1 + 73);
//		p2.addPoint(x1 + 47, y1 + 58);
//		p2.addPoint(x1 + 53, y1 + 73);
//		p2.addPoint(x1 + 69, y1 + 73);
//		p2.addPoint(x1 + 56, y1 + 83);
//		p2.addPoint(x1 + 61, y1 + 98);
//		p2.addPoint(x1 + 47, y1 + 88);
//		p2.addPoint(x1 + 34, y1 + 98);
//		p2.addPoint(x1 + 38, y1 + 83);
//		g.setColor(Color.WHITE);
//		g.drawPolygon(p2);
//		
		//Paint redStripe
		g.setColor(Color.RED);
		g.fillRect(0, 0, getWidth(), getHeight());
		
		//Paint whiteStripe
		g.setColor(Color.WHITE);
		g.fillRect(x1, 100, getWidth(), height/5);
		
		//Paint whiteStripe
		g.setColor(Color.WHITE);
		g.fillRect(x1, 250, getWidth(), height/5);
		
		//Paint Blue Triangle
		Polygon p3 = new Polygon();
		p3.addPoint(x1, y1);
		p3.addPoint(250, 225);
		p3.addPoint(x1, getHeight());
		g.setColor(Color.BLUE);
		g.fillPolygon(p3);
		
		Polygon p4 = new Polygon(); //Star (clockwise) direction
		p4.addPoint(x1 + 25, y1 + 225);//punta superior izquierdo
		p4.addPoint(x1 + 41, y1 + 225);//punta interior izquierda (Arriba)
		p4.addPoint(x1 + 47, y1 + 200);//punta de arriba
		p4.addPoint(x1 + 53, y1 + 225);//punta interior derecha 
		p4.addPoint(x1 + 69, y1 + 225);
		p4.addPoint(x1 + 56, y1 + 235);
		p4.addPoint(x1 + 61, y1 + 250);//faltan estas tres puntas
		p4.addPoint(x1 + 47, y1 + 240);
		p4.addPoint(x1 + 34, y1 + 250);
		p4.addPoint(x1 + 38, y1 + 235);
		g.setColor(Color.WHITE);
		g.fillPolygon(p4);
	}
}
