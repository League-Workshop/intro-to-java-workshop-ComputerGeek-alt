int position = 0;
void setup(){
  size (1000,1000);
  rect (250,350,500,500);
  triangle (250,350,500,50,750,350);
}
void draw(){
  background (0);
  rect (250,350,500,500);
  triangle (250,350,500,50,750,350);
  ellipse (position,500,100,100);
  position = position + 1;
  
  
  
} 
