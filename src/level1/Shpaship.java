package level1;

public class Shpaship {
	String pilot;
	int fuel;
	int extFuel;
	boolean lowfuel;
public 	Shpaship(String pilotName, int StartFuel, int StartExtFuel, boolean lowFuel){
	 pilot = pilotName;
	 fuel = StartFuel;
	 extFuel = StartExtFuel;
	lowfuel = lowFuel;
	if(fuel <= 50){
		lowfuel = true;
		
		
	}
	
}
void refuel(){
	
	
}
}

