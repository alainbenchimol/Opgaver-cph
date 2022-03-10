class Ball
{
  float x;
  float y;
  float speed;
  float w;
  float gravity = 0.1;

  Ball(float tempX, float tempY, float tempW)
  {
    x = tempX;
    y = tempY;
    w = tempW;
    speed = 0;
  }
  // Shake balls
  void shakeBall()
  {
    // Change the location
    x = x + random(-5, 5);
    y = y + random(-5, 5);
    // Constrain Zoog to window
    x = constrain(x, 0, width);
    y = constrain(y, 0, height);
  }

  void gravityBall()
  {
    // Add gravity to speed
    speed = speed + gravity;
  }
  void moveBall()
  {
    // Add speed to y location
    y = y + speed;
    // If square reaches the bottom
    // Reverse speed
    if (y > height)
    {
      speed = speed*random(-1, -0.95);
      y = height;
    }
  }
  void displayBall()
  {
    // Display the circle
    fill(0);
    noStroke();
    ellipse(x, y, w, w);
  }

  // If the drop is caught
  void caught()
  {
    speed = 0; // Stop it from moving by setting speed equal to zero
    // Set the location to somewhere way off-screen
    y = -1000;
  }
}
