package com.kodat.of.jobms.job.clients;

import com.kodat.of.jobms.job.external.Review;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "REVIEW-SERVICE" , url = "${review-service.url}")
public interface ReviewClient {
    @GetMapping("/reviews")
  List<Review> getAllReviews(@RequestParam("companyId")Long companyId);




}