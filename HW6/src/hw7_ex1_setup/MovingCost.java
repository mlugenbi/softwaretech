package hw7_ex1_setup;

public class MovingCost implements Visitor {

	@Override
	public void visitElectronic(Electronic e) {

		double electronicPrice = 0;
		
		if(e.getFragile()) {
			
			electronicPrice = (e.getWeight() * 0.1) * 5;
			
		}else {
			
			
			
			electronicPrice = (e.getWeight() *  (1.0 / 15.0)) * 5;

		}
		
		System.out.println("Total Cost for " + e.getName() + " is: " + electronicPrice + " Euros." );

		
	}

	@Override
	public void visitFurniture(Furniture f) {
		
		double furniturePrice = (f.getWeight() * 0.05) * 5;
		System.out.println("Total Cost for " + f.getName() + " is: " + furniturePrice + " Euros." );

	}

	@Override
	public void visitGlass(Glass g) {
		
		int thickness = g.getTickness();
		double lengthMeter = (g.getLength() *  0.01);
		double glassyPrice = 0;
		
		switch(thickness) {
		
			case 1:	
				
				glassyPrice = lengthMeter * 2;
				break;
				
			case 2: 
				
				
				glassyPrice = lengthMeter * 1.2;

				break;
				
			case 3:
				
				glassyPrice = lengthMeter * 0.7;

				break;
				
			default:
				System.out.println("Thickness not valid.");
				break;
		
		}
		
		System.out.println("Total Cost for " + g.getName() + " is: " + glassyPrice + " Euros." );

	}
	
	public void getCost(HouseholdItem h) {
		
		h.accept(this);
	}

}
