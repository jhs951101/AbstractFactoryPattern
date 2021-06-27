package pkg;

public class Protoss implements Race {
	
	Nexus nexus;
	Pylon pylon;
	
	@Override
	public MainCenterBuilding createMainCenterBuilding() {
		
		System.out.println("Protoss Nexus, Call Loading... ");
		System.out.println("Protoss Nexus, creating a formation... ");
		
		return nexus;
	}
	@Override
	public PopulationBuilding createPopulationBuilding() {
		
		System.out.println("Protoss Pylon, Call Loading... ");
		System.out.println("Protoss Pylon, creating a formation... ");
		
		return pylon;
	}
}
