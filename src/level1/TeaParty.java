package level1;

public class TeaParty {
public String welcome(String lastName, boolean isWoman, boolean isKnighted){
	String endGreet = "";
	if(isKnighted == true) {
		endGreet = "Hello Sir " + lastName;
	}else if(isWoman == true) {
		endGreet = "Hello Ms. " + lastName;
	}else {
		endGreet = "Hello Mr. " + lastName;
	}
	
	return endGreet;  
}
}
