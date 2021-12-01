package hw7_ex2;

public class Client {
	
public static void main(String[] args) {
		
		
		IndividualTeam chinaWomenTeak = new IndividualTeam(1,2,"Women's Teakwondo");
		IndividualTeam chinaWomenWater = new IndividualTeam(12, 2, "Women's Waterpolo");
		IndividualTeam chinaWomenGym = new IndividualTeam(3, 0, "Women's Artistic Gymnastics");
		IndividualTeam chinaMenShooting = new IndividualTeam(1, 1, "Men's Shooting");
		IndividualTeam chinaMenBasketball = new IndividualTeam(30, 0, "Men's Basketball");
		IndividualTeam afghanistanWomenRunning = new IndividualTeam(7, 0, "Women's Running");
		IndividualTeam afghanistanMenSprinting = new IndividualTeam(5, 1, "Men's Sprinting");
		IndividualTeam germanyWomenCycling = new IndividualTeam(1,2,"Women's Cycling");
		IndividualTeam germanyWomenTennis = new IndividualTeam(3,1,"Women's Tennis");
		IndividualTeam germanyMenTableTennis = new IndividualTeam(2,0,"Men's Table Tennis");
		IndividualTeam germanyMenFootball= new IndividualTeam(23,1,"Men's Football");
	
		CompositeTeam chinaWomen = new CompositeTeam("China-Women");
		CompositeTeam chinaMen = new CompositeTeam("China-Men");
		CompositeTeam afghanistanWomen = new CompositeTeam("Afghanistan-Women");
		CompositeTeam afghanistanMen = new CompositeTeam("Afghanistan-Men");
		CompositeTeam germanyWomen = new CompositeTeam("Germany-Women");
		CompositeTeam germanyMen = new CompositeTeam("Germany-Men");

		CompositeTeam china = new CompositeTeam("China");
		CompositeTeam afghanistan = new CompositeTeam("Afghanistan");
		CompositeTeam germany = new CompositeTeam("Germany");

		CompositeTeam asia = new CompositeTeam("Asia");
		CompositeTeam europe = new CompositeTeam("Europe");
		
		CompositeTeam olympia = new CompositeTeam("Olympia");






		


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
		
		;
		germanyMen.printAthletes();
		System.out.println();
		
		
		//Germany Name and Gold Medals
		
		
		germany.printGoldMedals();
		System.out.println();

		
		//Asia Name and Gold Medals
		
		
		asia.printGoldMedals();
		System.out.println();

		
		//Olympia Names and Athletes
		
		
		olympia.printAthletes();
		System.out.println();

		
		

		
	}

}
