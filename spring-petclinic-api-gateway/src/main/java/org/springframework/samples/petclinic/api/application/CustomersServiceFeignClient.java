package org.springframework.samples.petclinic.api.application;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author lain
 */
@FeignClient("customers-service")
public interface CustomersServiceFeignClient {

    @GetMapping("/owners/{ownerId}")
    OwnerDetails getOwner(@PathVariable("ownerId") final int ownerId);
}
