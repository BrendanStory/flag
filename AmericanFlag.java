import java.awt.*;
import java.applet.*;
public class AmericanFlag {
	
	
	private double scale;
	private Rectangle union;
	private Rectangle[] stripes;
	//private Star[] stars;

	public AmericanFlag(Rectangle union, Rectangle[] stripes, double scale, int x) {

		setScale(scale);

		for (int i = 0; i <= 13; i++) {
			union(topLeft, width, height);
			setX = x - 10;
		}
	}

	public double scale(){
		return scale;
	}

	public void setScale(double scale){
		this.scale = scale;

		
	}

}
	
