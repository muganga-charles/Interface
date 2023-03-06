package interfaces;
import java.util.*;
public class BusTest {//jk

	public static void main(String[] args) {
		Hybrid hybrid1 = new Hybrid(45, 1.2, 600, 150, 1);
		CNGBus cngbus1 = new CNGBus(50,1.00,200,2);
		ElectricBus electric1 = new ElectricBus(55,0.9,400);
		ArrayList<Bus> list2 = new ArrayList <Bus>();
		list2.add(hybrid1);
		list2.add(cngbus1);
		list2.add(electric1);
		
		for (Bus b: list2) {
			System.out.print("Bus: " + b.getID() + " ");
			System.out.print(b.getClass());
			if (b instanceof LiquidFuel) 
				System.out.print(" tier: "+ ((LiquidFuel) b).getEmissionTier());
				//System.out.print(" tier: "+ ((Bus) hybrid1).getID());
			if (b instanceof Electric)
				System.out.print(" voltage: "+ ((Electric) b).getVoltage());
			System.out.println();
		}
	}

}
