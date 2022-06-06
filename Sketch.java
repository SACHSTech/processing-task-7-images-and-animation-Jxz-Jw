import processing.core.PApplet;
import processing.core.PImage; //import the PImage library
 
public class Sketch extends PApplet {
 
  // declare a global image variable
  PImage imgPicture;
  PImage imgBackground;
  // imgPicture placeholder name
 
 
  float fltPictureX = 200;
  float fltPictureY = 200-50;
 
  float fltPictureXSpeed = 7;
  float fltPictureYSpeed = 5;
  
  float x = 150;
  float y = 100;

  float xSpeed = 5;
  float ySpeed = 4;
 
 
  public void settings() {
    size(400, 240);
 
  }
 
  public void setup() {
   
 
    // load picture
    imgPicture = loadImage("https://www.serebii.net/swordshield/pokemon/041.png");

    imgPicture.resize(imgPicture.width/5,imgPicture.height/5);

    imgBackground = loadImage("https://2.bp.blogspot.com/-KgKD-Lvu9-c/Uuk2r5gvybI/AAAAAAAABAg/z8RORmzyVcw/s1600/Pxywikiwalkthrough261.png");
 
  }
 
  public void draw() {
    background(128);
    image(imgBackground, 0, 0);
 
    // draw circle and move
    //circle(fltCirX, fltCirY, 20);
    ellipse(x, y, 10, 10);

    x += xSpeed;
    y += ySpeed;
  
    if (x < 0+10 || x > width-10) {
      xSpeed *= -1;
    }

    if (y < 0+10  || y > height-10) {
      ySpeed *= -1;
    }

    // draw picture and move
    image(imgPicture, fltPictureX, fltPictureY);
    fltPictureX -= fltPictureXSpeed;
    fltPictureY -= fltPictureYSpeed;
 
    if (fltPictureX < 0-10 || fltPictureX > width-36) {
      fltPictureXSpeed *= -1;
    }

    if (fltPictureY < 0-10  || fltPictureY > height-36) {
      fltPictureYSpeed *= -1;
    }
 
 
  }

}

