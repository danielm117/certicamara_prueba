import java.lang.reflect.Array;


public class Cube {
	private int [][][] cube;

	public Cube(int n, int val){
		 this.cube = new int [n][n][n];
		 this.initialize(val);
	}
	
	public int[][][] getCube() {
		return cube;
	}

	public void setCube(int[][][] cube) {
		this.cube = cube;
	}
	private void initialize(int val){
		for(int i = 0; i<cube.length;i++){
			for(int j = 0; j<cube.length;j++){
				for(int k = 0; k<cube.length;k++){
					cube[i][j][k]=val;
				}	
			}
		}
	}
	public void update(int x, int y, int z, int val){
		cube[x-1][y-1][z-1]=val;
	}
	
	public int query(int x1, int y1, int z1, int x2, int y2, int z2){
		int sum=0;
		for (int i=x1-1;i<x2;i++){
			for (int j=y1-1;j<y2;j++){
				for (int k=z1-1;k<z2;k++){
					sum += cube[i][j][k];
				}	
			}	
		}
		return sum;
	}
	
	public void printCube(){
		for(int i = 0; i<cube.length;i++){
			System.out.println("square " + i);
			for(int j = 0; j<cube.length;j++){
				for(int k = 0; k<cube.length;k++){
					System.out.print(cube[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		
	}
}

