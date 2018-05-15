package level1;

public class JamesBond {
	public static void main(String[] args) {
		Vault vault = new Vault(9875);
		JamesBond bond = new JamesBond();
		System.out.println(bond.findCode(vault));
	}
int findCode(Vault v) {	
 for (int i = 0; i < 1000000; i++) {
	if(v.tryCode(i)) {
		return i;
	}
} 
 return -1;
}
}
