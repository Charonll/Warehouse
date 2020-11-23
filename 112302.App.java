package pac;

public class App {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int arr[][]={{5,6},{10,11},{20,30},{100,999}};
		while(true){
		int s=(int)(Math.random()*10%4);
		Thread.sleep(1000);
		System.out.println("一秒已经过去了");
		System.out.println("("+arr[s][0]+","+arr[s][1]+")");
		}
	}

}
