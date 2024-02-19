package com.vendor.restvenderApi.controller;

import com.vendor.restvenderApi.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
    CloudVendor cloudVendor;
    @GetMapping("{vendorId}")
     public CloudVendor getCloudVendor(String vendorId)
     {
         return cloudVendor;
//         return new CloudVendor("c1","vendor1",
//                 "address1","xxxxxxx");
     }

     @PostMapping
     public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Succesfully";
     }
     @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Updated Succesfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        this.cloudVendor = null;
        return "Cloud Vendor deleted Succesfully";
    }

}
