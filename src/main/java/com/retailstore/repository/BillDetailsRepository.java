package com.retailstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retailstore.domain.BillDetails;

/**
 * @author pankajsamadhiya
 *
 */
public interface BillDetailsRepository  extends JpaRepository<BillDetails, Long>{
}
