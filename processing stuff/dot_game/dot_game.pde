int enemyX = 10;
int enemyY = 10;
int playerX = 250;
int playerY = 250;
int espeed = 1;
int pspeed = 5;
boolean isDed = false;
void setup(){
size(500,500);
}
void draw(){
  background(0,0,0);
  if(isDed == false){
     fill(255,255,255);
ellipse(playerX,playerY,10,10);
  }
fill(255,0,0);
ellipse(enemyX,enemyY,10,10);
move();
wall();
hit();
}
void move(){
if(enemyX > playerX && enemyY > playerY){
enemyX-=espeed;
enemyY-=espeed;
}else if(enemyX < playerX && enemyY > playerY){
enemyX+=espeed;
enemyY-=espeed;
}else if(enemyX > playerX && enemyY < playerY){
enemyX-=espeed;
enemyY+=espeed;
}else if(enemyX < playerX && enemyY < playerY){
enemyX+=espeed;
enemyY+=espeed;
}else if(enemyX < playerX){
enemyX+=espeed;
}else if(enemyX > playerX){
enemyX-=espeed;
}else if(enemyY < playerY){
enemyY+=espeed;
}else if(enemyY > playerY){
enemyY-=espeed;
}
//
if(keyPressed){
if(key == 'w'){
playerY-=pspeed;
}else if(key == 's'){
playerY+=pspeed;
}else if(key == 'a'){
playerX-=pspeed;
}else if(key == 'd'){
playerX+=pspeed;
}
}
}

void wall(){
if(playerY >= 500){
playerY = 499;
}
if(playerY <= 0){
playerY = 1;
}
if(playerX >= 500){
playerX = 499;
}
if(playerX <= 0){
playerX  = 1;
}
}

void hit(){
if(playerY == enemyY && playerX == enemyX){
isDed = true;
}
}