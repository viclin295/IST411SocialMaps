package socialmaps;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import twitter4j.*;
//import twitter4j.GeoLocation;
//import twitter4j.Query;
//import twitter4j.QueryResult;

@Controller
public class GoogleMapController {


    @GetMapping("/maps")
    public String showMaps4(Model model){
//        model.addAttribute("latitude",new Coordinates());
//        model.addAttribute("longitude",new Coordinates());
        model.addAttribute("coordinates",new Coordinates());
        return "maps/googlemaps4";
    }
    @PostMapping("/gettweets")
    @ResponseBody
    public String testcoord(@ModelAttribute Coordinates c) throws TwitterException {
        Twitter twitter = new TwitterFactory().getInstance();
        double res = 5;
        String resUnit = "mi";
        Query query = new Query().geoCode(new GeoLocation(c.getLatitude(),c.getLongitude()),res,resUnit);
        query.count(10);
        QueryResult result = twitter.search(query);
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body>");
        sb.append("<a href=\"http://localhost:8080/maps\" >[GO BACK]</a>");
        for (Status status : result.getTweets()) {
            sb.append("<p>@" + status.getUser().getScreenName() + ":" + status.getText() + "</p>");
        }
        return sb.toString();
    }

    @RequestMapping("/")
    public String login(){
        return "login";
    }

    @RequestMapping("/tinymap")
    public String tinyMap(){
        return "maps/tinymap";
    }
}
