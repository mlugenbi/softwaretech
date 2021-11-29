package hw7_ex2;

import java.util.ArrayList;
import java.util.List;

public class CompositeTeam implements Team {

	private Integer athletes;
    private String name;
    private Integer goldMedals;
    private List<Team> subTeams = new ArrayList<>();
    
    
    
    public CompositeTeam(String name) {
    	
    	this.name = name;
    	
    }
    
    public void addTeam(Team team) {
    	
    	subTeams.add(team);
    }
    
    public void removeTeam(Team team) {
    	
    	subTeams.remove(team);
    }
    
    public void getSubTeams() {
    	
    	subTeams.forEach(Team ->{
    		System.out.println(name);
    	});;
    }
    
	@Override
	public void printAthletes() {
		// TODO Auto-generated method stub
		for (Team sub : subTeams){
			
			sub.printAthletes();
			
			
		}
	}

	@Override
	public void printGoldMedals() {
		// TODO Auto-generated method stub
		for (Team sub : subTeams){
			
			sub.printGoldMedals();
			
			
		}	}

	@Override
	public void printName() {
		// TODO Auto-generated method stub
		System.out.println(this.name);
		
		for (Team sub : subTeams){
			
			sub.printName();
			
			
		}
	}

}
