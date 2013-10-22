import java.awt.*;
import java.applet.*;
public class AmericanFlag {
	
	private int x, y, width, height;
	private double scale;

	public AmericanFlag(int x, int y, double scale) {

		setX(x);
		setY(y);
		setScale(scale);
	}

	public draw(Graphics g){

	}

	public int x(){
		return x;
	}
	public int y(){
		return y;
	}

	public double scale(){
		return scale;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setScale(double scale){
		this.scale = scale;
	}

}
	
