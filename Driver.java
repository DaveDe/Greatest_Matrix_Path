public class Driver {
	
	public static void main(String[] args){
		
		/*GreatestPath g = new GreatestPath();
		
		g.printTiles();
		
		Tile[][] tiles = g.getTiles();
		
		int greatestPath = 0;
		
		for(int i = 0; i < tiles.length; i++){
			
			for(int j = 0; j < tiles[i].length; j++){
				
				int temp = g.findGreatestPath(tiles[i][j]);
				if(temp > greatestPath){
					greatestPath = temp;
				}
				
			}	
			
		}
		
		//greatestPath = g.findGreatestPath(tiles[2][2]);
		
		System.out.println("Greatest Path: "+greatestPath);*/
		
		GreatestPath3 g = new GreatestPath3();
		
		g.printTiles();
		
		Tile[][] tiles = g.getTiles();
		
		int greatestPath = 0;
		
		for(int i = 0; i < tiles.length; i++){
			
			for(int j = 0; j < tiles[i].length; j++){
				
				int temp = g.findGreatestPath(tiles[i][j]);
				if(temp > greatestPath){
					greatestPath = temp;
				}
				
			}	
			
		}
		
		//greatestPath = g.findGreatestPath(tiles[2][2]);
		
		System.out.println("Greatest Path: "+greatestPath);
		
	}

}
