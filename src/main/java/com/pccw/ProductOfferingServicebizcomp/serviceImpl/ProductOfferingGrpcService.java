package com.pccw.ProductOfferingServicebizcomp.serviceImpl;

import com.pccw.ProductOfferingServicebizcomp.repository.ProductOfferingRepository;
import lombok.extern.slf4j.Slf4j;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@GRpcService
public class ProductOfferingGrpcService {

    @Autowired
    ProductOfferingRepository bizCompRepo;

        void productOffering(ProductOfferRequest pRequest, StreamObserver<ProductOfferResponse> pResponse){

        }



        void productOffering(EmptyRequest pRequest, StreamObserver<ProductOfferResponse> pResponse){

        }

        void productOffering(ProductOfferListRequest pRequest, StreamObserver<ProductOfferListResponse> pResponse){}


       void productOffering(ProductOfferPatchRequest pRequest, StreamObserver<ProductOfferResponse> pResponse){

       }



       void productOffering(ProductOfferListRequest pRequest, StreamObserver<ProductOfferDeleteResponse> pResponse){
        }
}
