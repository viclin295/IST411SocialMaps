package socialmaps;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoogleMapController {

    @RequestMapping("/maps")
    public String showMaps(){
        return "googlemaps";
    }

    @RequestMapping("/")
    public String login(){
        return "login";
    }
}
