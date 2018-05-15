package level1;

public class Vault{
	int Code;
	public Vault(int Code){
		this.Code = Code;
	}
	boolean tryCode(int code) {
		if(code == Code) {
			return true;
		}else {
			return false;
		}
		
	}
}
