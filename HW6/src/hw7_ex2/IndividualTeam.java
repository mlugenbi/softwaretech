package hw7_ex2;

public class IndividualTeam implements Team {

	
	private Integer athletes;
    private String name;
    private Integer goldMedals;
    
    
    public IndividualTeam(int athletes, int goldMedals, String name) {
    	
    	this.athletes = athletes;
    	this.goldMedals = goldMedals;
    	this.name = name;
    }
	
	@Override
	public void printAthletes() {
		// TODO Auto-generated method stub
		System.out.println("Team: " + this.name + ", Number of Athletes: " + this.athletes);
		
	}

	@Override
	public void printGoldMedals() {
		// TODO Auto-generated method stub
		System.out.println("Team: " + this.name + ", Number of Gold Medals: " + this.goldMedals);
	}

	


}
