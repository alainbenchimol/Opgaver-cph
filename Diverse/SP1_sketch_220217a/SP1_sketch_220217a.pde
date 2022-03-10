AlainsDyr myAlainsDyr=new AlainsDyr();
Ball[] myBalls=new Ball[17];
int point=0;

void setup()
{
  size(500, 500);//size of the window
  smooth();
  frameRate(20);

  // Initialize ball index 0
  for (int i=0; i<myBalls.length; i++)
  {
    myBalls[i] = new Ball(width/10+i*20, i*2, 16);
  }
}

void draw()
{
  background(255);//Draw a background
  ellipseMode(CENTER);//ellipses and rects to CENTER mode
  rectMode(CENTER);

  myAlainsDyr.body();
  myAlainsDyr.mouth();
  myAlainsDyr.hair();
  myAlainsDyr.nose();
  myAlainsDyr.eyes();
  myAlainsDyr.legs();
  myAlainsDyr.feet();

  // Update and display all balls
  for (int i = 0; i < myBalls.length; i++ )
  {
    myBalls[i].gravityBall();
    myBalls[i].moveBall();
    myBalls[i].displayBall();
    myBalls[i].shakeBall();

    //  Caught balls
    if (myAlainsDyr.intersect(myBalls[i]))
    {
      myBalls[i].caught();
      println("Point: "+point);
      point=point+1;
    }
  }
}
