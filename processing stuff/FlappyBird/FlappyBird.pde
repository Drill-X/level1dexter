int birdX = 0;
int birdY = 0;
int birdV = 1;
int birdG = 1;
void setup(){
size(500,500);
}
void draw(){
background(0,0,0);
fill(255,255,255);
ellipse(birdX,birdY,10,10);
birdX += birdV;
birdY += birdG;
}