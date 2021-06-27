package pkg;

public class Main {

	public static void main(String[] args) {
		Race terran = new Terran();
		Race protoss = new Protoss();
		
		terran.createMainCenterBuilding();
		terran.createPopulationBuilding();
		
		protoss.createMainCenterBuilding();
		protoss.createPopulationBuilding();
	}

}
