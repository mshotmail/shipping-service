package shippingservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWildFlyController {


    @RequestMapping("ship")
    public String sayShip(){
        return ("Hello, from shippingservice");
    }
}
