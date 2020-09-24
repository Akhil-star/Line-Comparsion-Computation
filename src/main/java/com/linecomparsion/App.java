package com.linecomparsion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int x1,x2,y1,y2;
    	int x3,y3,x4,y4;
		int  l1,l2;
		
		x1=1; y1=1;
		x2=4;y2=4;
		x3=5;y3=1;
		x4=6;y4=1;
		
		l1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		l2=(int)Math.sqrt((x4-x3)*(x4-x3)+(y4-y3)*(y4-y3));
		System.out.println("Length of ("+x1+","+y1+") and ("+x2+","+y2+") is "+l1);
		System.out.println("Length of ("+x3+","+y3+") and ("+x4+","+y4+") is "+l2);
		
		Integer a=new Integer(l1);
        Integer b=new Integer(l2);
        int compare=a.compareTo(b);
        
        if(compare>0)
        {
      	  System.out.println("l1 is greater than l2");
        }
        else if(compare<0)
        {
      	  System.out.println("l1 is less than l2");
        }
        else
        {
      	  System.out.println("l1 is equal to l2");
        }
		
    }
}
