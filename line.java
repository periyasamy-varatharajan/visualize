import java.io.*;
import javax.swing.*; 
public class line
{
	point p1,p2;
	public line(int x1,int y1,int z1,int x2,int y2,int z2)
	{
		p1=new point(x1,y1,z1);
		p2=new point(x2,y2,z2);
	}
	public static void main(String args[])
	{
		int x1=0,x2=0,y1=0,y2=0,z1=0,z2=0;
		line l1=new line(x1,y1,z1,x2,y2,z2);
		JFrame frame=new JFrame();
		paper pa=new paper();
		pa.setSize(400,400);
		frame.setSize(500,500);
		frame.add(pa);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
}