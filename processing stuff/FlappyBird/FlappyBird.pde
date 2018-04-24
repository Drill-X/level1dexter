int birdX = 10;
int birdY = 250;
double birdV = 0.5;
double birdG = 0.5;
int pipeX =  500;
int pipebY = 300;
int pipebW = 100;
int pipebH = 200;
int pipeuY = 300;
int pipeuW = 100;
int pipeuH = 200;
int gapL = 100;
int randomPipeY;
int score = -1;
double pipeV = 1;
boolean noClip = false;
boolean isDed = false;
void setup(){
size(500,500);
}
void draw(){
background(0,0,0);
if(keyPressed == true && noClip == false){
noClip = true;
pipeV = 20;
}else if(keyPressed == true && noClip == true){
noClip = false;
pipeV = 1;
}

if(isDed == false || noClip == true){
fill(255,255,255);
ellipse(birdX,birdY,10,10);
text("Score: " + score, 250,250);
println("score: " + score);
birdY += birdV;
birdV += birdG;
if(birdY >= 500){
birdY = 0;
}else if(birdY <= 0){
birdY = 500;
}
fill(255,255,255);
rect(pipeX,pipebY,pipebW,pipebH);
rect(pipeX,pipeuY,pipeuW,pipeuH);
pipeX -= pipeV;
if(pipeX <= 0 - pipeuW){
pipeX = 500; 
randomPipeY = (int) random(100, 400);
pipebY = randomPipeY;
pipeuY = randomPipeY;
pipeuY = pipeuY - (pipeuH + gapL);
pipebH = 500 - pipebY;
score++;
}
if(noClip == false){
didHitPipeB();
didHitPipeU();
}
}}
void mousePressed(){
birdV =- 5;
}
void didHitPipeB(){
if(birdX < pipeX + pipebW && birdX > pipeX && birdY < pipebY + pipebH && birdY > pipebY){
println("you hit the bottom pipe");
isDed = true;
}
}
void didHitPipeU(){
if(birdX < pipeX + pipeuW && birdX > pipeX && birdY < pipeuY + pipeuH && birdY > pipeuY){
println("you hit the upper pipe");
isDed = true;
}
}