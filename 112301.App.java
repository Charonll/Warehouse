package pac;

import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			Scanner c=new Scanner(System.in);
			String b=c.next();
			int x=(int)(Math.random()*100);
			int y=(int)(Math.random()*100);
			if(b.equals("a")){
				System.out.println("R"+"("+((int)x)+","+((int)y)+")");
			}			
		}
	}

}
