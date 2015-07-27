
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUtil file = new FileUtil();
		int line = 0;
		String[] tokens;
		int numTest = Integer.parseInt(file.readFromFile("imput.txt", line++));
		for (int i=0;i<numTest;i++){
			tokens = (file.readFromFile("imput.txt", line++)).split(" ");
			int size=Integer.parseInt(tokens[0]);
			Cube cube = new Cube(size, 0);
			int numQuery = Integer.parseInt(tokens[1]);
			for(int j=0;j<numQuery;j++){
				tokens = (file.readFromFile("imput.txt", line++)).split(" ");
				if ((tokens[0].toUpperCase()).equals("UPDATE")){
					cube.update(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]));
				}else if ((tokens[0].toUpperCase()).equals("QUERY")){
					System.out.println(cube.query(Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]), Integer.parseInt(tokens[3]), Integer.parseInt(tokens[4]), Integer.parseInt(tokens[5]), Integer.parseInt(tokens[6])));
				}
			}
		}
	}

}
