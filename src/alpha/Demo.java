package alpha;

import org.apache.logging.log4j.*;


public class Demo {

	private static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I am debugging");
		log.info("Object is present");
		log.error("object is not present");
		log.fatal("this is fatal");
		//This is for git testing.

	}

}
