package level1;

public class rectangle {
private int width;
private int height;
//
public static void main(String[] args) {
	int d = 3;
	add1(d);
}

static double add1 (double i) {
	return i+1;
}
//
	public rectangle() {
		width = 7;
		height = 8;
	}
	
void setWidth (int i) {
	width = i;
}

void setHeight (int i) {
	height = i;
}

int getWidth() {
	return width;
}
int getHeight() {
	return height;
}

int findArea(int a, int b) {
	return a*b;
}
}
 