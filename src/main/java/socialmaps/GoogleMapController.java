package socialmaps;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoogleMapController {

    @RequestMapping("/maps")
    public String showMaps(){
        return "maps/googlemaps";
    }

    @RequestMapping("/maps2")
    public String showMaps2(){
        return "maps/googlemaps2";
    }

    @RequestMapping("/maps3")
    public String showMaps3(){
        return "maps/googlemaps3";
    }

    @RequestMapping("/googlelogin")
    public String login(){
        return "login";
    }
}
