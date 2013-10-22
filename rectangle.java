import.java.awt.*;
import.java.applet.*;
public class rectangle {
	private int x, y, width, height;
	private Graphics g;

	public rectangle(int x, int y, int width, int height, Graphics g){

	}

	public int x(){
		return x;
	}
	public int y(){
		return y;
	}

	public int width(){
		return width;
	}

	public int height(){
		return height;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public void setHeight(int height){
		this.height = height;
	}
}