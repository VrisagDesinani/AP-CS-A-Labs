package Unit9;

public class SeriesResonantCircuit extends ResonantCircuit{

	//creates a resistance instance variable, "R"
	double resistance;
	//creates capacitance instance variable, "C"
	double capacitance;
	//creates inductance instance variable, "L"
	double inductance;

	public SeriesResonantCircuit(double resonantFrequency, double bandwidth, double gainAtResonantFrequency) {
		super(resonantFrequency, bandwidth, gainAtResonantFrequency);
		
	}
	
	//return methods if you want to get any individual piece of data 
	public double getResistance() {
		return resistance;
	}

	public double getCapacitance() {
		return capacitance;
	}

	public double getInductance() {
		return inductance;
	}

	public void setResistance(double resistance) {
		this.resistance = resistance;
	}

	public void setCapacitance(double capacitance) {
		this.capacitance = capacitance;
	}

	public void setInductance(double inductance) {
		this.inductance = inductance;
	}
	
	public void constructSeriesCircuit() {
		
		double calcResistance = 1 / getGainAtResonantFrequency();
		double calcInductance = calcResistance / getBandwidth(); 
		double calcCapacitance = 1 / ((Math.pow(getGainAtResonantFrequency(), 2)) * calcInductance);
		
		setResistance(calcResistance);
		setCapacitance(calcCapacitance);
		setInductance(calcInductance);
		
	}
	
	public void display()
	{
		System.out.println("\nResonant Series Circuit variables: ");
		System.out.printf("Resistance: %.4f\nCapacity: %.4f\nInductance: %.4f\n\n", getResistance(), getCapacitance(), getInductance());
	}




}
