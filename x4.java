it r,g,b;
float button1X=100, button1Y=100, button1W=80, button1H=40;
int counter=0;


void setup() {
size(640,480);
reset();
rectMode(CENTER);
}
void reset(){
r=100;
g=200;
b=250;
}

void draw(){
  background(r,g,b);
rect(button1X,button1Y,button1W,button1H);
  fill(150,10,10);
    text("click me!",60+100/4,80+40*2/3);
    fill(200,200,10);
}
void showbutton(float x, float y, float w,float h){
  fill(255,255,0);
  rect(x,y,w,h);
}
void keypressed(){
if (key=='q') exit();
if (key=='r') reset();
}
void mousePressed(){
  if( hit (mouseX,mouseY,button1X,button1Y,button1W/2,button1H/2) ){
    counter=counter+1;
    if (counter %2>0){
      r=255;
      g=50;
      b=0;
    }else{
      reset();
    }
  }
}
boolean hit(float x1,float y1,float x2,float y2,float w,float h){
  boolean result;
  
  if (abs(x1-x2)<w && abs(y1-y2)<h){
    result = true;
  }else{
    result=false;
  }
  return result;
}
