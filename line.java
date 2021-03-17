import java.io.*;
import javax.swing.*; 
import java.awt.*;
import java.awt.image.*;
public class line
{
	point p1,p2;
	float mzx,myx,c,cy,dx,dy,dz;
	float x1,x2,y1,y2,z1,z2;
	public line(int x1,int y1,int z1,int x2,int y2,int z2)
	{
		p1=new point(x1,y1,z1);
		p2=new point(x2,y2,z2);
		dz=z2-z1;
		dx=x2-x1;
		dy=y2-y1;
		mzx=dz/dx;
		myx=dy/dx;
		//mzy=
		cy=this.y1-myx*x1;
		c=z1-mzx*x1-myx*y1;
	}
	public void drawline(BufferedImage bi)
	{
		int x,z,y;
		//Graphics g=bi.createGraphics();
		//g.drawString("line testing",50,50);
		System.out.println("mzx:"+this.mzx+"myx:"+this.myx+"cy:"+this.cy);
		for  (int i=(int)this.p1.x;i<(int)this.p2.x;i++)
		{
			y=(int)(this.myx*i+cy);
			z=(int)this.mzx*i;
			System.out.println(i+" "+y+" "+z);
			bi.setRGB(i,y,-1);
			
		}
		
	}
	
	public static void main(String args[])
	{
		int x1=50,x2=100,y1=50,y2=300,z1=50,z2=300;
		line l1=new line(x1,y1,z1,x2,y2,z2);
		JFrame frame=new JFrame();
		paper pa=new paper();
		pa.setSize(400,400);
		frame.setSize(500,500);
		frame.add(pa);
		pa.addline(l1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		System.out.println(l1.c);
		
	}
	
}