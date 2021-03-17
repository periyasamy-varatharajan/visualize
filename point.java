import java.awt.*;
import java.awt.image.*;
public class point
{
	double x,y,z,r,t,a;
	//float r=Math.sqrt(x*x+y*y+z*z);
	public point(int x,int y,int z)
	{
		this.x=x;
		this.y=y;
		this.z=z;
		r=Math.sqrt(x*x+y*y+z*z);
		if(z==0)
		{
			t=1.5708;
		}
		else
		{
			t=Math.atan(Math.sqrt(x*x+y*y)/z);
		}
		if(x==0)
		{
			a=1.5708;
		}
		else
		{
			a=Math.atan(y/x);
		}
	}
	public void drawpoint(BufferedImage bi)
	{
		//Graphics g=bi.createGraphics();
		//g.drawString("point added",(int)x,(int)y);
		bi.setRGB((int)this.x,(int)this.y,-1);
	}
	public static void main(String args[])
	{
		point p=new point(1,0,0);
		System.out.println(p.r);
		System.out.println(Math.toDegrees(p.t));
		System.out.println(Math.toDegrees(p.a));
	}
}
