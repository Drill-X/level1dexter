int rainX = 250;
int rainY = 0;
int score = 0;
void setup(){
size(500,500);
}
void draw(){ 
background(225,225,225);
fill(0,0,225);
ellipse(rainX,rainY,10,10);
fill(225,0,0);
rect(mouseX, 450, 50,50);
noStroke();
if(rainY == 500){
rainY = 0;
rainX = (int) random(500);
}
caTch();
rainY += 50;
}

void caTch(){
if(rainX <= mouseX + 50 && rainX >= mouseX && rainY == 50){
score++;
println("score = " + score);
fill(225, 225, 225);
textSize(16);
text("Score: " + score, 250,250);
}
}