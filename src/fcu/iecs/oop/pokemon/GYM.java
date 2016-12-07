package fcu.iecs.oop.pokemon;
import java.util.Random;

public class GYM{
	
	public static Player fight(Player p1,Player p2){
		
		int p1winner = 0 , p2winner = 0;
		int i,X;
		
			for(i = 0;i < 3;i++){ 	
				
				Random random = new Random();
			
				//先找種類再比CP
				PokemonType p1type = p1.getPokemons()[i].getType();
				PokemonType p2type = p2.getPokemons()[i].getType();
			
				int p1cp = p1.getPokemons()[i].getCp();
				int p2cp = p2.getPokemons()[i].getCp();
			
				//種類一樣
					if(p1type == p2type){
						
						if(p1cp > p2cp){
					 		p1winner++; 
					 	}
						 else if(p1cp < p2cp){
						 	p2winner++; 
					 	}
						//CP相同，隨機取1
						 else{
						 	X = random.nextInt(2); 
						 			
						 		if(X == 0){
						 			p1winner++; 
						 			}
						 		else{
						 			p2winner++; 
						 			}
							} 
					}
					
					//種類不同，比較屬性相剋(火剋草、草剋水、水剋火)
					else{
					
						if(p1type == PokemonType.FIRE && p2type == PokemonType.GRASS){
							p1winner++; 
						}
						else if(p1type == PokemonType.GRASS && p2type == PokemonType.WATER){
							p1winner++; 
						}
						else if(p1type == PokemonType.WATER && p1type == PokemonType.FIRE){
							p1winner++; 
						}
						else{
							p2winner++; 
						}
					}
				}
			
			//玩家在參賽的三隻Pokemon中只要有二隻為勝，則為贏家
		
			if(p1winner >= 2 && p1winner > p2winner){ 
				p1.setLevel(p1.getLevel() + 1); 
					System.out.println("\"Winner is [" + p1.getPlayerName() + "] , and his/her level becomes [" + p1.getLevel() + "] .\"");  
						return p1;
			} 
			
			else { 
				p2.setLevel(p2.getLevel() + 1); 
					System.out.println("\"Winner is [" + p2.getPlayerName() + "] , and his/her level becomes [" + p2.getLevel() + "] .\""); 
						return p2; 
			} 
	}
}
