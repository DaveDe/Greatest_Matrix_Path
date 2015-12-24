public class Driver {
	
	public static void main(String[] args){
		
		/*GreatestPath g5 = new GreatestPath();
		
		g5.printTiles();
		
		Tile[][] tiles5 = g5.getTiles();
		
		int greatestPath5 = 0;
		
		for(int i = 0; i < tiles5.length; i++){
			
			for(int j = 0; j < tiles5[i].length; j++){
				
				int temp = g5.findGreatestPath(tiles5[i][j]);
				if(temp > greatestPath5){
					greatestPath5 = temp;
				}
				
			}	
			
		}
		
		System.out.println("Greatest Path: "+greatestPath5);*/
		
		GreatestPath4 g4 = new GreatestPath4();
		
		g4.printTiles();
		
		Tile[][] tiles4 = g4.getTiles();
		
		int greatestPath4 = 0;
		
		for(int i = 0; i < tiles4.length; i++){
			
			for(int j = 0; j < tiles4[i].length; j++){
				
				int temp = g4.findGreatestPath(tiles4[i][j]);
				if(temp > greatestPath4){
					greatestPath4 = temp;
				}
				
			}	
			
		}
		
		System.out.println("Greatest Path: "+greatestPath4);
		
		/*GreatestPath3 g3 = new GreatestPath3();
		
		g3.printTiles();
		
		Tile[][] tiles3 = g3.getTiles();
		
		int greatestPath3 = 0;
		
		for(int i = 0; i < tiles3.length; i++){
			
			for(int j = 0; j < tiles3[i].length; j++){
				
				int temp = g3.findGreatestPath(tiles3[i][j]);
				if(temp > greatestPath3){
					greatestPath3 = temp;
				}
				
			}	
			
		}
		
		System.out.println("Greatest Path: "+greatestPath3);*/
		
	}

}
