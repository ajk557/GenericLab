
public class DataSetGen <T extends Measurable>{
	private DataSet data;
	
	public DataSetGen () {
		data = new DataSet();
	}
	
	public void add (T add) {
		data.add(add);
	}
	
	public double getAverage () {
		return data.getAverage();
	}
	
	public Measurable getMaximum() {
		return data.getMaximum();
	}
}

