package hw7_ex1_setup;

public class PackingInstructions implements Visitor {

	@Override
	public void visitElectronic(Electronic e) {
		
		
		System.out.println(e.getName() + ":");
		System.out.println("Should be covered with Polyethylene foam film and packed in a box with a dimension of " + (e.getHeight() + 1) + "x" + (e.getLength() + 1) + "x" + (e.getWidth() + 1) + ".");
		

	}

	@Override
	public void visitFurniture(Furniture f) {
		

		System.out.println(f.getName() + ":");
		System.out.println("Should be covered with waterproof covers with an area of "  + f.getLength() + "x" + f.getWidth() + ".");
		
		
	}

	@Override
	public void visitGlass(Glass g) {
		
		System.out.println(g.getName() + ":");
		System.out.println("should be packed in a box with a dimension of " + (g.getHeight() + 1) + "x" + (g.getLength() + 1) + "x" + (g.getWidth() + 1) + " and filled with Bubble wraps.");

	}
	
	public void getInstructions(HouseholdItem h) {
		
		h.accept(this);
	}

}
