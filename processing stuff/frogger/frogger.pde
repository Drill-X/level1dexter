int frogY = 390;
int frogX = 200;
int frogsped = 25;
boolean didwin = false;
car car1 = new car(350,200,5);
car car2 = new car(350,200,5);
car car3 = new car(350,200,5);
car car4 = new car(350,200,5);
car car5 = new car(350,200,5);
car car6 = new car(350,200,5);
void setup(){
size(400,400);
}
void draw(){
background(0,0,0);
ellipse(frogX,frogY,10,10);
if(didwin == true){
text("YOU WIN",180,180);
}
didHitSide();
car1.displayCar();
car1.carMoveL();
car1.didHitScreenL();
if(car1.intersects(car1)){
  frogY = 390;
frogX = 200;
}
car2.displayCar();
car2.carMoveL();
car2.didHitScreenL();
if(car2.intersects(car2)){
  frogY = 390;
frogX = 200;
}
car3.displayCar();
car3.carMoveL();
car3.didHitScreenL();
if(car3.intersects(car3)){
  frogY = 390;
frogX = 200;
}
car4.displayCar();
car4.carMoveR();
car4.didHitScreenR();
if(car4.intersects(car4)){
  frogY = 390;
frogX = 200;
}
car5.displayCar();
car5.carMoveR();
car5.didHitScreenR();
if(car5.intersects(car5)){
  frogY = 390;
frogX = 200;
}
car6.displayCar();
car6.carMoveR();
car6.didHitScreenR();
if(car6.intersects(car6)){
  frogY = 390;
frogX = 200;
}
}

void keyPressed(){
  if(key == CODED){
      if(keyCode == UP)
      {
      //Frog Y position goes up
      frogY-=frogsped;
      }
      if(keyCode == DOWN)
      {
        //Frog Y position goes down 
       frogY+=frogsped;
      }
      if(keyCode == RIGHT)
      {
       //Frog X position goes right
       frogX+=frogsped;
      }
      if(keyCode == LEFT)
      {
        //Frog X position goes left
        frogX-=frogsped;
      }
   }
}

void didHitSide(){
if(frogY <= 0){
frogY = 1;
fill(255,255,0);
didwin = true;
}else if(frogY >= 400){
frogY = 399;
}else if(frogX <= 0){
frogX = 1;
}else if(frogX >= 400){
frogX = 399;
}
}
public class car{
 float carX;
float carY;
float carspeed;
float carW;
float carH;
  public car(float X,float Y, float S){
    this.carX=X;
    this.carY=Y;
    this.carspeed=S;
    this.carW=50;
    this.carH=20;
}
void carMoveL(){
carX-=carspeed;
}
void carMoveR(){
carX+=carspeed;
}
void displayCar(){
  fill(255,255,255);
  rect(carX, carY, 50, 20);
}
void didHitScreenL(){
if(carX <= 0 && didwin == false){
carX = 350;
carY = random(0,400);
}
}
void didHitScreenR(){
if(carX >= 400 && didwin == false){
carX = 10;
carY = random(0,400);
}
}
boolean intersects(car car) {
if ((frogY > car.getY() && frogY < car.getY()+50) && (frogX > car.getX() && frogX < car.getX()+20))
          return true;
    else 
        return false;
}
float getY(){
return carY;
}
float getX(){
return carX;
}
}