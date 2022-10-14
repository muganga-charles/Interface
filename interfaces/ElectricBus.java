package interfaces;

public class ElectricBus extends Bus implements LiquidFuel, Electric {
	private double voltage;

	public ElectricBus(int capacity, double cost, double voltage) {
		super(capacity, cost);
		this.voltage = voltage;
	}
	public double getAccel() {
		return 5.0;
	}
	@Override
	public double getVoltage() {
		return voltage;
	}
	@Override
	public double getRange() {
		return 0;
	}
	@Override
	public double getEmissionTier() {
		return 0;
	}
	
}
