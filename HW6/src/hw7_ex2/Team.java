package hw7_ex2;

public abstract interface Team {
	
	
	public void printAthletes();
	public void printGoldMedals();
	public void printName();
	
	public static void main(String[] args) {
		
		
		CompositeTeam olympia = new CompositeTeam("Olympia");
		
		CompositeTeam asia = new CompositeTeam("Asia");
		CompositeTeam europe = new CompositeTeam("Europe");

		CompositeTeam china = new CompositeTeam("China");
		CompositeTeam afghanistan = new CompositeTeam("Afghanistan");
		CompositeTeam germany = new CompositeTeam("Germany");

		CompositeTeam chinaWomen = new CompositeTeam("China-Women");
		IndividualTeam chinaWomenTeak = new IndividualTeam(1,2,"Women's Teakwondo");
		IndividualTeam chinaWomenWater = new IndividualTeam(12, 2, "Women's Waterpolo");
		IndividualTeam chinaWomenGym = new IndividualTeam(3, 0, "Women's Artistic Gymnastics");
		
		CompositeTeam chinaMen = new CompositeTeam("China-Men");
		IndividualTeam chinaMenShooting = new IndividualTeam(1, 1, "Men's Shooting");
		IndividualTeam chinaMenBasketball = new IndividualTeam(30, 0, "Men's Basketball");

		CompositeTeam afghanistanWomen = new CompositeTeam("Afghanistan-Women");
		IndividualTeam afghanistanWomenRunning = new IndividualTeam(7, 0, "Women's Running");

		
		CompositeTeam afghanistanMen = new CompositeTeam("Afghanistan-Men");
		IndividualTeam afghanistanMenSprinting = new IndividualTeam(5, 1, "Men's Sprinting");

		
		CompositeTeam germanyWomen = new CompositeTeam("Germany-Women");
		IndividualTeam germanyWomenCycling = new IndividualTeam(1,2,"Women's Cycling");
		IndividualTeam germanyWomenTennis = new IndividualTeam(3,1,"Women's Tennis");


		
		
		CompositeTeam germanyMen = new CompositeTeam("Germany-Men");
		IndividualTeam germanyMenTableTennis = new IndividualTeam(2,0,"Men's Table Tennis");
		IndividualTeam germanyMenFootball= new IndividualTeam(23,1,"Men's Football");





		


		olympia.addTeam(asia);
		asia.addTeam(china);
		asia.addTeam(afghanistan);
		china.addTeam(chinaWomen);
		china.addTeam(chinaMen);
		chinaWomen.addTeam(chinaWomenTeak);
		chinaWomen.addTeam(chinaWomenGym);
		chinaWomen.addTeam(chinaWomenWater);
		
		chinaMen.addTeam(chinaMenShooting);
		chinaMen.addTeam(chinaMenBasketball);
		
		
		afghanistan.addTeam(afghanistanWomen);
		afghanistan.addTeam(afghanistanMen);
		
		afghanistanWomen.addTeam(afghanistanWomenRunning);
		
		afghanistanMen.addTeam(afghanistanMenSprinting);
		
		
		olympia.addTeam(europe);
		europe.addTeam(germany);
		germany.addTeam(germanyMen);
		germany.addTeam(germanyWomen);
		
		germanyMen.addTeam(germanyMenTableTennis);
		germanyMen.addTeam(germanyMenFootball);
		
		germanyWomen.addTeam(germanyWomenCycling);
		germanyWomen.addTeam(germanyWomenTennis);

		
		
		//Germany-Men Name and Atheltes
		
		chinaMen.printName();
		chinaMen.printAthletes();
		System.out.println();
		
		
		//Germany Name and Gold Medals
		
		germany.printName();
		germany.printGoldMedals();
		System.out.println();

		
		//Asia Name and Gold Medals
		
		asia.printName();
		asia.printGoldMedals();
		System.out.println();

		
		//Olympia Names and Athletes
		
		olympia.printName();
		olympia.printAthletes();
		System.out.println();

		
		

		
	}
	


}
