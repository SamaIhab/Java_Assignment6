package java_assignment6;

public class Television {
	private int width;
	private int height;
	private int screenSize;
	
	private int maxVolume, minVolume, volume;
	private boolean power;
	private double freq;
	private String name;
	
	
	//another method using enum
	/*enum Channel{   
		Channel1(5.0, "Channel 1"), Channel2(10.0, "Channel 2"), Channel3(15.0, "Channel 3");   
		  
		protected double frequency; 
		private String name;
		
		private Channel(double f, String n){  
		this.frequency=f;  
		this.name=n;
		}  
		public double getFrequency() {
			return this.frequency;
		}
		public String getName() {
			return this.name;
		}
		
	}*/


	public Television(int w, int h, int size) {
		width=w;
		height=h;
		screenSize=size;
	}
	
	public void setMaxVolume(int v) {
		maxVolume=v;
	}
	
	public void setMinVolume(int v) {
		minVolume=v;
	}
	
	public void setVolume(int v) {
		if ((v>= this.getMinVolume()) && (v <= this.getMaxVolume())) {
			volume=v;
		}
		else
			v=this.getMinVolume();
	}
	
	public void setFrequency(double f) {
		freq=f;
	}
	
	public void setPower(boolean p) {
		power=p;
	}
	
	public void changeVolume(int v) {
		if ((v>= this.getMinVolume()) && (v <= this.getMaxVolume())) {
			volume=v;
		}
		else
			v=this.getMinVolume();
	}
	
	public void setName(String s) {
		name =s;
		
	}
	
	
	
	
	public int getMaxVolume() {
		return maxVolume;
	}
	
	public int getMinVolume() {
		return minVolume;
	}
	
	public int getVolume() {
		return volume;
	}
	
    public double getFrequency() {
		return freq;
	}
	
	public boolean getPower() {
		return power;
	}
	public String getName() {
		return name;
	}
	

}
