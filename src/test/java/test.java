import org.apache.log4j.Logger;
import org.junit.Test;

public class test {

    @Test
    public void testLoger() {

        final Logger logger = Logger.getLogger("TestErrOut");
        logger.debug(" This is debug!!!");
        logger.info(" This is info!!!");
        logger.warn(" This is warn!!!");
        logger.error(" This is error!!!");
        logger.fatal(" This is fatal!!!");
    }

}
