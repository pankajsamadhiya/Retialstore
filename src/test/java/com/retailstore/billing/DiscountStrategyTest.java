package com.retailstore.billing;




import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author pankajsamadhiya
 *
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class DiscountStrategyTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DiscountStrategyTest.class);

	@Mock
	private DiscountStrategy discountStrategy;
	
	@Test
	public void testExtraDiscount(){
	  LOGGER.info("calling extraDiscount method ");
	  discountStrategy.extraDiscount(200.0);
	 	
	}
	
}
