

public class Test {
	 void findZero(int array2d[][]) {
		// TODO Auto-generated method stub
		 for (int row = 0; row < array2d.length; row++) {
				for (int coulmn = 0; coulmn < array2d[0].length; coulmn++) {
					if (array2d[row][coulmn]==0) {
						System.out.print("R_zero("+ coulmn+","+row+")\r");
						System.out.print("R_left("+ (coulmn-1)+","+row+")\r");
						System.out.print("R_right("+ (coulmn+1)+","+row+")\r");
						System.out.print("R_up("+ coulmn+","+(row+1)+")\r");
						System.out.print("R_down("+ coulmn+","+(row-1)+")");
					}
					
				}
				
			}
	}
	
}
