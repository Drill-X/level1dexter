package level1;

public class Athlete {
String Name;
int speed;
int number;
static int count = 0;
static String location = "somewhere";
static int startTime = 13;
public Athlete(String Name, int speed, int number) {
	count++;
	this.Name = Name;
	this.speed = speed;
	this.number = number;
	number = count;
	
}
public static void main(String[] args) {
Athlete Jeff = new Athlete("Jeff", 10, 1);	
Athlete Bob = new Athlete("Bob", 9001, 2);
Athlete Zach = new Athlete("Zach", 0, 3);
System.out.println(Jeff.getName());	
	System.out.println(Bob.getName());
	System.out.println(Zach.getName());
	System.out.println(Jeff.getNumber());
	System.out.println(Bob.getNumber());
	System.out.println(Zach.getNumber());
System.out.println(location);
	location = "nowhere";
System.out.println(location);
Jeff.setLocation("Potatoe");
System.out.println(Jeff.getLocation());
System.out.println(Zach.getLocation());
}
String getName() {
	return Name;
}
int getSpeed() {
	return speed;
}
int getNumber() {
	return number;
}
void setLocation(String location_) {
	location = location_;
}
String getLocation() {
	return location;
}
}
