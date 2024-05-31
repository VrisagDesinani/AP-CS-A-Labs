package Unit9;

public class ResonantCircuit {
	
	//represents the resonant frequency with the ω
	double resonantFrequency;
	//represents the bandwidth, "B"
	double bandwidth;
	//represents the gain at the resonant frequency, "k"
	double gainAtResonantFrequency;
	
	//constructor 
	public ResonantCircuit(double resonantFrequency, double bandwidth, double gainAtResonantFrequency) {
		this.resonantFrequency = resonantFrequency;
		this.bandwidth = bandwidth;
		this.gainAtResonantFrequency = gainAtResonantFrequency;
	}

	//gets the resonant frequency 
	public double getResonantFrequency() {
		return this.resonantFrequency;
	}
	
	//modifies the resonant frequency 
	public void setResonantFrequency(double frequency) {
		this.resonantFrequency = frequency;
	}
	
	//gets the bandwidth frequency
	public double getBandwidth() {
		return this.bandwidth;
	}
	
	//modifies the resonant bandwidth 
	public void setBandwidth(double bandwidth) {
		this.bandwidth = bandwidth;
	}
	
	//gets the gain at resonant frequency
	public double getGainAtResonantFrequency() {
		return this.gainAtResonantFrequency;
	}
	
	//modifies the gain at resonant frequency
	public void setGainAtResonantFrequency(double gain)	{
		this.gainAtResonantFrequency = gain;
	}
	
	//the display method
	public void display() {
		
		System.out.println("Resonant Circuit vairables: ");
		//uses printf and is sorted to the 4th decimal place 
		System.out.printf("Resonance Frequency: %.4f\nBandwidth: %.4f\nGain at Resonant Frequency: %.4f\n", getResonantFrequency(), getBandwidth(), getGainAtResonantFrequency());
	}
	
}