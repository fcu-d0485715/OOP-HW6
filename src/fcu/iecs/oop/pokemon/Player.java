package fcu.iecs.oop.pokemon;

public class Player{
	
//�ݩʭȥu��Q���O�����غc�l�Τ�k�ϥ�

	private String playerName;
	
	private Pokemon[] pokemons;
	
	private int level = 1;
	
//�����O�����Ҧ���k���O��~�}��ϥΡA�Y�����L���O���i�H�I�sPlayer���O�Ҵ��Ѫ���k
	
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