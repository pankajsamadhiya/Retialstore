package com.retailstore.service;

import com.retailstore.domain.BillDetails;
import com.retailstore.dto.request.BillRequestDto;

/**
 * @author pankajsamadhiya
 *
 */
public interface IBillService {
	public BillDetails generateBill(BillRequestDto billDto);
}
