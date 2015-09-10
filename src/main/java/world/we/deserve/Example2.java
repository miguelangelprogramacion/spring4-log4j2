/**
 * 
 */
package world.we.deserve;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
public class Example2 {
	
	static Logger log = LogManager.getLogger(Example2.class.getName());
	
	public static void main(String[] args) {
		
		HumanBeing hb = new HumanBeing();
		
		hb.reflection("I don't get much time for reflection");
	}

}
