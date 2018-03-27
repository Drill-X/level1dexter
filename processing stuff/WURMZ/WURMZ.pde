float fillR = random(255);
float fillG = random(255);
float fillB = random(255);
int wurmz = 0;
boolean isOff =false;
void setup(){
size(500,500);
background(0,0,0);
}
void draw(){
  if(isOff == false){
for(int i = 0;i <= wurmz; i++){
fill(fillR,fillG,fillB);
float wrmX = getWormX(i);
float wrmY = getWormY(i);
ellipse(wrmX,wrmY,10,10);
//println("ball made");
}}
if(mousePressed && mouseButton == LEFT && isOff == false){
wurmz++;
}else if(mousePressed && mouseButton == LEFT && isOff == true){
isOff = false;
}else if(mousePressed && mouseButton == RIGHT && isOff == false){
isOff = true;
wurmz = 0;
}
makeMagical();
}
float frequency = .001;
float noiseInterval = PI; 

void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}

float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}