package com.retailstore.billing;


import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.retailstore.dto.request.BillRequestDto;

/**
 * @author pankajsamadhiya
 *
 */


@RunWith(SpringRunner.class)
@SpringBootTest
public class GroceryDiscountStrategyTest {
	

	@Mock
	private DiscountStrategy discountStrategy;
	
	@Mock
	private BillRequestDto billDto;
	
	Billing billing;
	
	@InjectMocks
	GroceryDiscountStrategy groceryDiscountStrategy;
	
	@Before
	public void setUp(){
		billing  = new Billing(discountStrategy,billDto);
	}
	
	public void testCalculateFinalBillAmount(){
		when(billDto.getBillAmount()).thenReturn(200.0);
		groceryDiscountStrategy.calculateFinalBillAmount(billing);
		
	}
	


}
