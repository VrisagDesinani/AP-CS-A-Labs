package Unit9;

public class VrisagU9E3D {

	public static void main(String[] args) {
		
		ResonantCircuit RC = new ResonantCircuit(3.0, 45.3, 39.4);
		SeriesResonantCircuit SRC = new SeriesResonantCircuit(3.0, 45.3, 39.4);
		ParallelCircuit PC = new ParallelCircuit(3.0, 45.3, 39.4);
		
		RC.display();
		SRC.constructSeriesCircuit();
		SRC.display();
		PC.constructParallelCircuit();
		PC.display();
	}

}
