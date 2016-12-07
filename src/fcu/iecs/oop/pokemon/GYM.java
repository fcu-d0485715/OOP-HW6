package fcu.iecs.oop.pokemon;
import java.util.Random;

public class GYM{
	
	public static Player fight(Player p1,Player p2){
		
		int p1winner = 0 , p2winner = 0;
		int i,X;
		
			for(i = 0;i < 3;i++){ 	
				
				Random random = new Random();
			
				//��������A��CP
				PokemonType p1type = p1.getPokemons()[i].getType();
				PokemonType p2type = p2.getPokemons()[i].getType();
			
				int p1cp = p1.getPokemons()[i].getCp();
				int p2cp = p2.getPokemons()[i].getCp();
			
				//�����@��
					if(p1type == p2type){
						
						if(p1cp > p2cp){
					 		p1winner++; 
					 	}
						 else if(p1cp < p2cp){
						 	p2winner++; 
					 	}
						//CP�ۦP�A�H����1
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
					
					//�������P�A����ݩʬ۫g(���g��B��g���B���g��)
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
			
			//���a�b���ɪ��T��Pokemon���u�n���G�����ӡA�h��Ĺ�a
		
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
