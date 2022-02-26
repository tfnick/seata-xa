package io.seata.sample.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "stock-xa")
public interface StockFeignClient {

    @GetMapping("/deduct")
    String deduct(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") int count);

}
