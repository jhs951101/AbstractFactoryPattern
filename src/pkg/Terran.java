package pkg;

public class Terran implements Race {
	
	CommandCenter commandcentor;
	SupplyDepot supplydepot;
	
	@Override
	public MainCenterBuilding createMainCenterBuilding() {
		
		System.out.println("Terran Command Center, Construction Loading... (Step 1/3)");
		System.out.println("Terran Command Center, Construction Loading... (Step 2/3)");
		System.out.println("Terran Command Center, Construction Loading... (Step 3/3)");
		
		return commandcentor;
	}
	@Override
	public PopulationBuilding createPopulationBuilding() {
		
		System.out.println("Terran Supply Depot, Construction Loading... (Step 1/3)");
		System.out.println("Terran Supply Depot, Construction Loading... (Step 2/3)");
		System.out.println("Terran Supply Depot, Construction Loading... (Step 3/3)");
		
		return supplydepot;
	}
}
