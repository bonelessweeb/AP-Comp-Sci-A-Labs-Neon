import java.awt.Image;
import java.util.ArrayList;

public class Bullets {
	ArrayList<Ammo>shots;
	private Image image;
	
	public Bullets(){
		
	}
	
	public Bullets(int ammo){
		for (int i = 0; i < ammo; i++){
			shots.add(new Ammo());
		}
	}
}