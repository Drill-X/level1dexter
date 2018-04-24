int frogY = 390;
int frogX = 200;
int frogsped = 5;
void setup(){
size(400,400);
}
void draw(){
background(0,0,0);
ellipse(frogX,frogY,10,10);
}
void keyPressed()
{
  if(key == CODED){
      if(keyCode == UP)
      {
      //Frog Y position goes up
      frogY-=frogsped;
      }
      else if(keyCode == DOWN)
      {
        //Frog Y position goes down 
       frogY+=frogsped;
      }
      else if(keyCode == RIGHT)
      {
       //Frog X position goes right
       frogX+=frogsped;
      }
      else if(keyCode == LEFT)
      {
        //Frog X position goes left
        frogX-=frogsped;
      }
   }
}