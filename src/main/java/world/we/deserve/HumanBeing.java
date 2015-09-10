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
public class HumanBeing {

	static Logger log = LogManager.getLogger(HumanBeing.class.getName());
	
	int fear;
	int hope;
	int lies;
	
	public void reflection(String msm)
	{
		log.debug(msm);
	}
	

	/**
	 * 
	 */
	public HumanBeing() {
		super();
	}

	/**
	 * @return the fear
	 */
	public int getFear() {
		return fear;
	}

	/**
	 * @param fear
	 *            the fear to set
	 */
	public void setFear(int fear) {
		this.fear = fear;
	}

	/**
	 * @return the hope
	 */
	public int getHope() {
		return hope;
	}

	/**
	 * @param hope
	 *            the hope to set
	 */
	public void setHope(int hope) {
		this.hope = hope;
	}

	/**
	 * @return the lies
	 */
	public int getLies() {
		return lies;
	}

	/**
	 * @param lies
	 *            the lies to set
	 */
	public void setLies(int lies) {
		this.lies = lies;
	}
}
