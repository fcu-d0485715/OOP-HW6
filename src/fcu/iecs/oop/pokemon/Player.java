package fcu.iecs.oop.pokemon;

public class Player{
	
//屬性值只能被類別內的建構子或方法使用

	private String playerName;
	
	private Pokemon[] pokemons;
	
	private int level = 1;
	
//此類別內的所有方法都是對外開放使用，即任何其他類別都可以呼叫Player類別所提供的方法
	
	public Player(String playerName){
		this.playerName = playerName;
	}

	public String getPlayerName(){
		return playerName;
	}

	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}

	public Pokemon[] getPokemons(){
		return pokemons;
	}

	public void setPokemons(Pokemon[] pokemons){
		this.pokemons = pokemons;
	}

	public int getLevel(){
		return level;
	}

	public void setLevel(int level){
		this.level = level;
	}
	
}