int birdX = 10;
int birdY = 0;
double birdV = 0.5;
double birdG = 0.5;
int pipeX =  0;
int pipebY = 300;
int pipebW = 100;
int pipebH = 200;
int pipeuY = 300;
int pipeuW = 100;
int pipeuH = 200;
int gapL = 100;
int randomPipeY;
double pipeV = 1;
void setup(){
size(500,500);
}
void draw(){
background(0,0,0);
fill(255,255,255);
ellipse(birdX,birdY,10,10);
birdY += birdV;
birdV += birdG;
if(birdY >= 500){
birdY = 0;
}
fill(255,255,255);
rect(pipeX,pipebY,pipebW,pipebH);
rect(pipeX,pipeuY,pipeuW,pipeuH);
pipeX -= pipeV;
if(pipeX <= 0){
pipeX = 400;
randomPipeY = (int) random(100, 400);
pipebY = randomPipeY;
pipeuY = randomPipeY;
pipeuY = pipeuY - (pipeuH + gapL);
pipebH = 500 - pipebY;
}
didHitPipeB();
didHitPipeU();
}
void mousePressed(){
birdV =- 5;
}
void didHitPipeB(){
if(birdX < pipeX + pipebW && birdX > pipeX && birdY < pipebY + pipebH && birdY > pipebY){
println("you hit the bottom pipe");
}
}
void didHitPipeU(){
if(birdX < pipeX + pipeuW && birdX > pipeX && birdY < pipeuY + pipeuH && birdY > pipeuY){
println("you hit the upper pipe");
}
}