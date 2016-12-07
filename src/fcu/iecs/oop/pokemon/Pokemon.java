package fcu.iecs.oop.pokemon;

public class Pokemon{
	
	private final String name; //name�����A���r��A�Q��l�ƫ�N����ק�
	private final PokemonType type; //���A��PokemonType�A�Q��l�ƫ�N����ק�
	private int cp; //���A�����
	
	public Pokemon(String name,PokemonType type,int cp){
		this.name = name;
		this.type = type;
		this.cp = cp;
	}
	
	public String getName(){
		return name;
	}
	
	public PokemonType getType(){
		return type;
	}
	
	public int getCp(){
		return cp;
	}

	public void setCp(int cp){
		this.cp = cp;
	}

}