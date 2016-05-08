package module3; 
import processing.core.*;

public class MyPApplet extends PApplet
{
	private String url ="http://www.noupe.com/wp-content/uploads/trans/wp-content/uploads/2010/08/beach53.jpg";
			private PImage background;
			public void setup()
			{
				size (530,500);
				background = loadImage(url,"jpg");
			
			}
			public void draw()
			{
				background.resize(530,height);
				image(background,0,0);
				fill(255,209,0);
				ellipse(2*width/3, height/4,width/6,height/6);
			}
	
}
