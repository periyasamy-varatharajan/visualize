import java.io.*;
import javax.swing.*; 
import java.awt.*;
import java.awt.image.*;
public class line
{
	point p1,p2;
	float mx,my,c,dx,dy,dz;
	public line(int x1,int y1,int z1,int x2,int y2,int z2)
	{
		p1=new point(x1,y1,z1);
		p2=new point(x2,y2,z2);
		dz=z2-z1;
		dx=x2-x1;
		dy=y2-y1;
		mx=dz/dx;
		my=dz/dy;
		c=z1-mx*x1-my*y1;
	}
	public void drawline(BufferedImage bi)
	{
		Graphics g=bi.createGraphics();
		g.drawString("line testing",50,50);
	}
	
	public static void main(String args[])
	{
		int x1=0,x2=1,y1=2,y2=5,z1=4,z2=3;
		line l1=new line(x1,y1,z1,x2,y2,z2);
		JFrame frame=new JFrame();
		paper pa=new paper();
		pa.setSize(400,400);
		frame.setSize(500,500);
		frame.add(pa);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		System.out.println(l1.c);
		
	}
	
}