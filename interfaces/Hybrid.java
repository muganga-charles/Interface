package interfaces;

public class Hybrid extends Bus implements Electric,LiquidFuel{
	private double voltage;
	private double range;
	private int emissionTier;
	public Hybrid(int capacity, double cost, int voltage, int range, int emissionTier) {
		super(capacity, cost);
		this.voltage = voltage;
		this.range = range;
		this.emissionTier = emissionTier;
	}
	
	public double getRange() {return range;}
	
	public double getVoltage() {return voltage;}
	public final double getAccel() {return 4.0;}

	@Override
	public double getEmissionTier() {
		// TODO Auto-generated method stub
		return emissionTier;
	}



	
}
