package fcu.iecs.oop.pokemon;

public class Pokemon{
	
	private final String name; //name的型態為字串，被初始化後就不能修改
	private final PokemonType type; //型態為PokemonType，被初始化後就不能修改
	private int cp; //型態為整數
	
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