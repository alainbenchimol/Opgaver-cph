/*
3.a Draw a traffic light using colors stored in variables - one for each of the 4 colors (background is the 4th).
 3.b add a gray color for the turned off effect
 3.c have the light turn on/off (green or red) automatically.
 */

int i=0;

void setup()
{
  size(400, 400);
  background(255);
  frameRate(1);
}

void draw()
{
  rectMode(CENTER);
  fill(0);
  rect(width/2, height/2, width/3, height*3/4);//black box

  int gray=color(100);
  int red=color(255, 0, 0);
  int yellow=color(255, 255, 0);
  int green=color(0, 200, 0);

  fill(gray);
  ellipse(width/2, height/4, width/5, width/5);//stop light
  ellipse(width/2, height/2, width/5, width/5);//mittle light
  ellipse(width/2, height*3/4, width/5, width/5);//bottom light

  if (i==0)
  {
    fill(red);
    ellipse(width/2, height/4, width/5, width/5);//stop light
  }
  if (i==1)
  {
    fill(red);
    ellipse(width/2, height/4, width/5, width/5);//stop light
    fill(yellow);
    ellipse(width/2, height/2, width/5, width/5);//mittle light
  }
  if (i==2)
  {
    fill(green);
    ellipse(width/2, height*3/4, width/5, width/5);//bottom light
  }
  if (i==3)
  {
    fill(yellow);
    ellipse(width/2, height/2, width/5, width/5);//mittle light
    fill(green);
    ellipse(width/2, height*3/4, width/5, width/5);//bottom light
  }
  if (i<4)
  {
    i++;
  } else
  {
    i=0;
  }
}
