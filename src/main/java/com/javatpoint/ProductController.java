package com.javatpoint;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.javatpoint.bo.Data;
@RestController
public class ProductController 
{
    @Autowired
    private IProductService productService;
    @Autowired
    private ISecurityService securityService;
    //mapping the getProduct() method to /product
    @GetMapping(value = "/product")
    public List<Product> getProduct() 
    {
    //finds all the products
        List<Product> products = productService.findAll();
        //returns the product list
        return products;
    }

    @GetMapping(value = "/getReports")
    public Data getReports() 
    {
    
        return securityService.getReports();
    }

    @GetMapping(value = "/getReportsColour")
    public Data getReportsColour(@RequestParam int colourCode) 
    {
    
        return securityService.getReportsColour(colourCode);
    
    }
    
    @GetMapping(value = "/updateSOS")
    public String updateSOS(@RequestParam String appointmentIdr) 
    {
        return securityService.updateSOS(appointmentIdr);
    }
    @GetMapping(value = "/addAlert")
    public String addAlert(@RequestParam String appointmentIdr,@RequestParam String status) 
    {
        return securityService.addAlert(appointmentIdr,status);
    }
    
     @GetMapping(value = "/checkInOut")
    public String checkInOut(@RequestParam String appointmentIdr,@RequestParam String status) 
    {
        return securityService.checkInOut(appointmentIdr,status);
    }

}
