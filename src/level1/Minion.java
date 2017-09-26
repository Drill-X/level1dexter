package level1;
public class Minion {
String color;
	String name;
	String master;
	int eyes;
	public Minion (String name, int eyes, String color, String master){
	 this.name = name;
 	 this.master = master;
 	 this.color = color;
 	 this.eyes = eyes;
	}
	String getName() {
			return(name);
	}
	int getEyes() {
		return(eyes);
	}
	String getMaster() {
		return(master);
	}
	String getColor() {
		return(color);
	}
	void setName (String name_){
	name = name_;	
	}
	void setColor (String color_) {
		color = color_;
	}
	void setMaster(String master_) {
			master = master_;
	}
	void setEyes(int eyes_) {
		eyes = eyes_;
	}	
}