package bo.edu.ucb.ingsoft.sakila;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class citys {

    List<city> cityss = new ArrayList<>();

    @GetMapping(path="/cityssOld", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<city> listAll() {
        return cityss;
    }

    @PostMapping(path="/citys", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE )
    public city listAll(@RequestBody city city) {
        cityss.add(city);
        return city;
    }
    
}
