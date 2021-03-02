import javax.swing.*;
import java.awt.*;
public class paper extends JPanel
{
	public void addpoint(point p)
	{	
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawString("this is testing ",25,25);
	}
	
	
	public static void main(String args[])
	{
		JFrame frame =new JFrame("testing panel");
		paper canvas=new paper();
		canvas.setSize(500,500);
		frame.setSize(600,600);
		JPanel jp =new JPanel();
		frame.add(canvas);
		frame.add(jp);
		canvas.setBackground(Color.black);
		jp.setBackground(Color.blue);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
	
		
