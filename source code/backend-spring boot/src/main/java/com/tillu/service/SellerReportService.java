package com.tillu.service;

import com.tillu.model.Seller;
import com.tillu.model.SellerReport;
import java.util.List;
import java.util.Optional;

public interface SellerReportService {
    SellerReport getSellerReport(Seller seller);
    SellerReport updateSellerReport( SellerReport sellerReport);

}
