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
		int  l1;
		
		x1=1; y1=1;
		x2=4;y2=4;
		
		
		l1=(int)Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Length of ("+x1+","+y1+") and ("+x2+","+y2+") is "+l1);

    }
}
