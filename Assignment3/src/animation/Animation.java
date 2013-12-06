package animation;
import java.awt.Image;
import java.util.ArrayList;



/**
 * ASSIGNMENT 3:: static animation
 * @author Eddiebaldo
 *
 */

public class Animation {

	private ArrayList scenes;
	private int sceneIndex;
	private long movieTime;
	private long totalTime;
	
	/**
	 * constructor
	 */
	public Animation(){
		
		scenes = new ArrayList();
		totalTime = 0;
		start();
		
	}
	
	/**
	 * add scene to ArrayList and sets time for each scene
	 * @param i
	 * @param t
	 */
	public synchronized void addScene(Image i, long t){
		
		totalTime += t ;
		scenes.add(new OneScene(i, totalTime));
		
		
		
	}
	/**
	 * start animation from beginning
	 */
	public synchronized void start(){
		
		movieTime = 0;
		sceneIndex = 0;
		
		
		
	}
	/**
	 * change scenes
	 * @param timePassed
	 */
	public synchronized void update(long timePassed){
		
		if(scenes.size() >1){
			movieTime += timePassed;
			if(movieTime >= totalTime){
				movieTime =0;
				sceneIndex =0;
				
			}
			while(movieTime > getScene(sceneIndex).endTime){
				sceneIndex++;
			}
		}
		
	}
	/**
	 * get animation current image
	 * @return
	 */
	public synchronized Image getImage(){
		if(scenes.size()==0){
			return null;
		}else{
			return getScene(sceneIndex).pic;
			
		}
	}
	/**
	 * get scene
	 * @param x
	 * @return
	 */
	private OneScene getScene(int x){
		return (OneScene) scenes.get(x);
	}
	/**
	 * private inner class 
	 * @author Eddiebaldo
	 *
	 */
	private  class OneScene {
		Image pic;
		long endTime;
		
		public OneScene(Image pic, long endTime){
			this.pic = pic;
			this.endTime = endTime;
		}
	}
	
}
