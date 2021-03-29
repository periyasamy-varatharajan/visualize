package visualize;
import java.io.*;
import javax.swing.*;
/**
*class that is used for testing classes that are used in main class
*/
public class test
{
	//testing position on point 
	public static void testpoint() throws Exception
	{
		
		String input="";
		JFrame frame=new JFrame();
		paper pa=new paper();
		pa.setSize(500,400);
		point p;
		int x,y,z;
		BufferedReader bi=new BufferedReader(new InputStreamReader(System.in));
		frame.add(pa);
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//pa.setVisible(true);
		while(true)
		{
			System.out.println("enter x:");
			//bi.flush();
			x=Integer.parseInt(bi.readLine());
			System.out.println("enter y:");
			//bi.flush();
			y=Integer.parseInt(bi.readLine());
			System.out.println("enter z:");
			//bi.flush();
			z=Integer.parseInt(bi.readLine());
			
		
		p=new point(x,y,z);
			pa.addpoint(p);
			pa.repaint();
		}
	}
	public  static void testline() throws Exception
	{
		String input="";
		JFrame frame=new JFrame();
		paper pa=new paper();
		pa.setSize(500,400);
		point p;
		int x1,y1,z1,x2,y2,z2;
		BufferedReader bi=new BufferedReader(new InputStreamReader(System.in));
		frame.add(pa);
		frame.setSize(600,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		while(true)
		{
			System.out.println("enter x1:");
			x1=Integer.parseInt(bi.readLine());
			System.out.println("enter y1:");
			y1=Integer.parseInt(bi.readLine());
			System.out.println("enter z1:");
			z1=Integer.parseInt(bi.readLine());
			System.out.println("enter x2:");
			x2=Integer.parseInt(bi.readLine());
			System.out.println("enter y2:");
			y2=Integer.parseInt(bi.readLine());
			System.out.println("enter z2:");
			z2=Integer.parseInt(bi.readLine());
			
			line l1=new line(x1,y1,z1,x2,y2,z2);
			pa.addline(l1);
			pa.repaint();
		}
		
	}
	
	
	public static void main(String args[])throws Exception
	{
		int choice=0;
		BufferedReader bi=new BufferedReader(InputStreamReader(System.in));
		while(true){
			System.out.println("1.compile \n2.test \n3.exit");
			System.out.flush();
			choice=Integer.parseInt(bi.readLine())
			if(choice==1)
			{
				Sytem.out.println("compile mode");
			}
			else if(choice==1)
			{
				System.out.println("testing mode");
			}
			else if(choice==2)
			{
				System.out.println("that all");
			}
			else{
				System.out.println("oops")
			}
		}
		System.out.println("the end")
	}
}
