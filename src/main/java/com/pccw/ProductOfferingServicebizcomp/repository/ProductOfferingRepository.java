package com.pccw.ProductOfferingServicebizcomp.repository;

import com.pccw.ProductOfferingServicebizcomp.models.ProductOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductOfferingRepository extends JpaRepository<ProductOffer,Integer> {
}
