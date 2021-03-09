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
		p.drawpoint(bi);
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawString("this is testing ",25,25);
		g.drawImage(bi,0,0,null);
	}
	public void addline(line l){
		int x1=0,y1=0,z1=0;
		int x2=0,y2=0,z2=0;
		x1=(int)l.p1.x;
		x2=(int)l.p2.x;
		y1=(int)l.p1.y;
		y2=(int)l.p2.y;
		z1=(int)l.p1.z;
		z2=(int)l.p2.z;
		System.out.println("addline working");
		l.drawline(bi);
		bi.setRGB(400,400,-1);
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
	
		
