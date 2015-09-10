/**
 * 
 */
package world.we.deserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * @author Miguel Ángel Dev (miguelangelprogramacion@gmail.com)
 *
 */
public class Example {

	static Logger log = LogManager.getLogger(Example.class.getName());

	public static void main(String[] args) throws IOException {
		System.out.println("===> Please enter a number:\n===>");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.valueOf(br.readLine());
		log.info("Info : number is " + number);
		log.warn("Warning : number is " + number);
		log.debug("Debug : number is " + number);
		log.error("Error : number is " + number);
		log.fatal("Fatal : number is " + number);
		
		if(number > 100) {
			log.info("Info : You chose a number > 100 ");
			log.warn("Warning : You chose a number > 100 ");
			log.debug("Debug : You chose a number > 100 ");
			log.error("Error : You chose a number > 100 ");
			log.fatal("Fatal : You chose a number > 100 ");
			
		} else {
			log.info("Info : You chose a number < 100 ");
			log.warn("Warning : You chose a number < 100 ");
			log.debug("Debug : You chose a number < 100 ");
			log.error("Error : You chose a number < 100 ");
			log.fatal("Fatal : You chose a number < 100 ");			
		}
		String numberStr = String.valueOf(number);
		for(int i=0; i<=10; i ++) {
			if(numberStr.contains(String.valueOf(i))) {
				log.info("Info : Your number has the digit " + i);
				log.warn("Warning : Your number has the digit " + i);
				log.debug("Debug : Your number has the digit " + i);
				log.error("Error : Your number has the digit " + i);
				log.fatal("Fatal : Your number has the digit " + i);
			}
		}
	}
}