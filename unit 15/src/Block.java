//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{


	}
	
	

	//add other Block constructors - x , y , width, height, color
	public Block(int x, int y){
		setX(x);
		setY(y);
	}
	
	public Block(int x, int y, int width){
		setX(x);
		setY(y);
		setWidth(width);
	}
	
	public Block(int x, int y, int width, int height){
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
	}
	
	public Block(int x, int y, int width, int height, Color c){
		setX(x);
		setY(y);
		setWidth(width);
		setHeight(height);
		setColor(c);
	}
	
	
	
	
	
	
	
	
	
	
   //add the other set methods
   

   public void setColor(Color col)
   {
	  color = col;
	  
   }
   
   public void setX(int x){
	   xPos = x;
   }
   
   public void setY(int y){
	   yPos = y;
   }
   
   public void setPos(int x, int y){
	   xPos = x;
	   yPos = y;
   }
   
   public void setHeight(int h){
	   height = h;
   }
   
   public void setWidth(int w){
	   width = w;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block two = (Block)obj;
		if (getX() == two.getX() && getY() == two.getY() && getWidth() == two.getWidth() && getHeight() == two.getHeight())
			return true;

		return false;
	}   

   //add the other get methods
    
	
	public int getX(){
		return xPos;
	}
	
	public int getY(){
		return yPos;
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height; 
	}

	public Color getColor(){
		if (color == null){
			color = Color.BLACK;
		}
		return color;
	}
	

   //add a toString() method  - x , y , width, height, color
	
	public String toString(){
		String output = "";
		output = "" + getX() + " " + getY() + " " + getWidth() + " " + getHeight() + " " + getColor();
		return output; 
	}
	
	
	
}