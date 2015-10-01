float button1x=250,button1y=250,button1w=80,button1h=40;


void setup() {
size(640,480);
reset();

}
void reset(){

}
void draw(){
background(255,255,0);
showButton(button1x,button1y,button1w,button1h);
fill(150,10,10);
text("click me!",100+80/4,100+40*2/3);
}
