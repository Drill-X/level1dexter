int ballX = 0;
int ballY = 0;
int Xspeed = 5;
int Yspeed = 5;
void setup(){
size(500,500);
}
void draw(){
background(0,0,0);
fill(255,255,255);
ellipse(ballX,ballY,10,10);
ballY += Yspeed;
ballX += Xspeed;
if(ballX >= 500 || ballX <= 0){
Xspeed = -Xspeed;
}
if(ballY >= 500 || ballY <= 0){
Yspeed = -Yspeed;
}
rect(mouseX, 400, 50, 10);
if(ballX >= mouseX && ballX <= mouseX+50 && ballY == 400){
Yspeed = -Yspeed;
}
println("mouse X"+mouseX);
println("ball X"+ballX);
println("ball Y"+ballY);
println("X speed"+Xspeed);
println("Y speed"+Yspeed);
}