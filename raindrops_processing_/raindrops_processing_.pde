int rainX = 125;
int rainY = 0;
int rains = 0;
int score = 0;
int G1 = 251;
int G2 = 251;
void setup(){
size(500,500);
}
void draw(){ 
background(225,225,225);
//text("Score: " + score + " Rains = " + rains, 250,250);
fill(0,0,225);
ellipse(rainX,rainY,10,10);
rains++;
fill(225,0,0);
if(mouseX <= 250){
rect(mouseX, 450, 50,50);
}else{
rect(125, 450, 50,50);
}
noStroke();
if(rainY == 500){
rainY = 0;
rainX = (int) random(250);
}
caTch();
rainY += 50;
//
fill(0,0,255);
ellipse(G1, score, 10, 10);
fill(255,0,0);
ellipse(G2, rains, 10, 10);
G2++;
G1++;
if(G1 >= 500){
G1 = 251;
}
if(G2 >= 500){
G2 = 251;
}
if(rains == 500){
rains = 499;
}
}

void caTch(){
if(rainX <= mouseX + 50 && rainX >= mouseX && rainY == 450){
score++;
println("score = " + score);
fill(225, 225, 225);
//textSize(16);
}
}