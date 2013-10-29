import java.awt.*;
import java.applet.*;
public class rectangle {
	private int width, height;
	public Graphics g;
	private Point topLeft;


	public rectangle(Point topLeft, int width, int height, ){

		setWidth(width);
		setHeight(height);

		g.fillRect(topLeft, width, height);

	}

	public int width(){
		return width;
	}

	public int height(){
		return height;
	}
	public void setWidth(int width){
		this.width = width;
	}

	public void setHeight(int height){
		this.height = height;
	}
}