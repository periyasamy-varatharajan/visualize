import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
public class paper extends JPanel
{
	BufferedImage bi=new BufferedImage(500,500,BufferedImage.TYPE_USHORT_GRAY);
	//Graphics im= bi.createGraphics();
	public void addpoint(point p)
	{	
		//im.drawString("testing",25,25);
		bi.setRGB((int)p.x,(int)p.y,-1);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawString("this is testing ",25,25);
		g.drawImage(bi,0,0,null);
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
		canvas.addpoint(new point(50,50,50));
	}
}
	
		
