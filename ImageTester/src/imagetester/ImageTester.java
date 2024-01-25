package imagetester;
import processing.core.PApplet;
import processing.core.PImage;

public class ImageTester extends PApplet {
    PImage character;
    PImage bg;

    public static void main(String[] args) {
        PApplet.main("imagetester.ImageTester");
    }

    public void settings() {
        size(500, 500);
    }
    public void setup() {
        character = loadImage("C:\\Users\\Student\\Desktop\\ImageTester\\Images\\Character.png");
        bg = loadImage("Images/Background.png");

    }
    public void draw() {
        background(bg);
        image(character, 0, 0);
        character.resize(300,300);
    }

}
