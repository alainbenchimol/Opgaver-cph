class AlainsDyr
{
  void body()
  {
    stroke(0);
    fill(100);
    if (mouseX<width/2)
    {
      ellipse(mouseX, mouseY, 150, 100);//body
    }
  }

  void mouth()
  {
    stroke(0, 0, 0);
    line(mouseX-20, mouseY+40, mouseX+20, pmouseY+40);//Mouth
    if (mouseX<width/2&&mouseY>height/2)
    {
      stroke(random(255), random(255), random(255));
      line(mouseX-20, mouseY+40, mouseX+20, pmouseY+40);//Mouth random color
    }
    if (mouseX>width/2&&mouseY<height/2)
    {
      fill(random(255), random(255), random(255));
      ellipse(mouseX+20, pmouseY+50, 10, 20);//tung random color right side
    }
  }

  void hair()
  {
    int y=-50;
    int py=-75;
    stroke(mouseX, 175, mouseY);
    line(mouseX, mouseY+y, pmouseX, pmouseY+py);//mittle hair
    for (int i=0; i<=9; i=i+3)
    {
      line(mouseX-2-i, mouseY+y, pmouseX-7-i, pmouseY+py);//left hair
      line(mouseX+2+i, mouseY+y, pmouseX+7+i, pmouseY+py);//right hair
    }
  }

  void nose()
  {
    stroke(0);
    fill(255);
    ellipse(mouseX, mouseY, 50, 60);//nose
    fill(random(255), random(255), random(255));
    for (int j=0; j<=20; j=j+20)
    {
      ellipse(mouseX-10+j, mouseY, 20, 30);//nostril/næsebor
    }
  }

  // A function that returns true or false based if the catcher intersects a raindrop
  boolean intersect(Ball d) {
    float distance = dist(mouseX, mouseY, d.x, d.y); // Calculate distance
    if (distance < 10 + d.w) { // Compare distance to sum of radii
      return true;
    } else
    {
      return false;
    }
  }

  void eyes()
  {
    fill(mouseX, 0, mouseY);
    for (int k=0; k<=148; k=k+148)
    {
      ellipse(mouseX-74+k, mouseY-30, 32, 64);//eyes big ovals
    }

    fill(0);
    for (int l=0; l<=140; l=l+140)
    {
      ellipse(mouseX-70+l, mouseY-30, 20, 30);//eyes inner ovals
    }

    fill(mouseX, 200, mouseY);
    for (int m=0; m<=140; m=m+140)
    {
      rect(pmouseX-65+m, pmouseY-30, 5, 10);//eyes iris
    }
  }

  void legs()
  {
    stroke(0);
    for (int n=0; n<=20; n=n+20)
    {
      line(mouseX-10+n, mouseY+50, pmouseX-10+n, pmouseY+100);//legs
    }
  }

  void feet()
  {
    fill(0, 255, 10);
    for (int p=0; p<=40; p=p+40)
    {
      rect(pmouseX-20+p, pmouseY+99, -20+p, 2);//feet
    }
  }
}

void mouseMoved()
{
  if (mouseX>410)
  {
    mouseX=100;//moves alainsdyr to left side
  }
  if (mouseX<90)
  {
    mouseX=400;//moves alainsdyr to right side
  }
}

void mousePressed()
{
  println("Iv, iv...POWER TO THE IV'S!...;-) ");
}

void keyPressed()
{
  println("Iv's have the POWER!...;-P ");
}
