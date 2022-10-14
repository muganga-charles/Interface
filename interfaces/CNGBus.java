package interfaces;

public class CNGBus extends Bus implements LiquidFuel,Electric {
	
	private int range;
	private int emissionTier;
	
	public CNGBus(int capacity, double cost, int range, int emissionTier) {
		super(capacity, cost);
		this.range = range;
		this.emissionTier = emissionTier;
}
	@Override
	public double getVoltage() {
		return 0;
	}
	@Override
	public double getRange() {
		return range;
	}
	@Override
	public double getEmissionTier() {
		return emissionTier;
	}
	@Override
	public double getAccel() {
		return 3.0;
	}
}