import org.apache.logging.log4j.*;

public class TestLog {

	public static Logger log = LogManager.getLogger(TestLog.class);
	
	public static void main(String[] args) {
	
		
		log.info("webdriver invocation is done");
		
		log.fatal("this is fatal message");
		
		log.debug("debug started");
		
		log.warn("test case may fail after entering this particular block");
		
		log.error("this test case got failed");
       
	}

}
