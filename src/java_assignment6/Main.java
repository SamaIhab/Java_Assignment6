package java_assignment6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Television tv= new Television(40,25,32);
		
		int maxv=99;
		int minv=0;
		int v=40;
		boolean p= true;
		double f= 5.0;  
		String name="channel1";
		
		
		tv.setMaxVolume(maxv);
		tv.setMinVolume(minv);
		tv.setVolume(v);
		tv.setFrequency(f);
		tv.setName(name);
		
		
		//1. turn tv on
		tv.setPower(p);
		System.out.printf("TV is ON: %b\n", tv.getPower());

		
		//2. get freq of channel
		tv.getFrequency();
		

		//get freq of channel with enum method 
		System.out.println("Frequency of channel: "+ tv.getFrequency());
		
		/*for (Television.Channel s : Television.Channel.values()) {
			if(s.getFrequency()==f) {
				System.out.println("Frequency:  "+s.getFrequency());  
				
			}
			
		}
		
		//get name of channel with the enum method
		for (Television.Channel s : Television.Channel.values()) {
			if(s.getFrequency()==f) {
				System.out.println("Name of channel:  "+s.getName());  
				
			}
			
		}*/
		
		
		//get name 
		System.out.println("Name of channel: "+ tv.getName());
		
		
		
		//decrease volume
		tv.setVolume(--v);
		System.out.printf("decrease volume by 1: %d\n", tv.getVolume());
		
		//increase volume
		tv.setVolume(++v);
		System.out.printf("increase volume by 1: %d\n", tv.getVolume());
		

		//turn tv off
		tv.setPower(!p);
		System.out.printf("TV is ON: %b\n", tv.getPower());
		
		
		
		
		
		
		
		
		
		

	}

}
