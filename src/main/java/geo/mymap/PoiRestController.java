package geo.mymap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/poi")
public class PoiRestController {
    @Autowired
    private PoiRepository poiRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Poi> get() {
        return poiRepository.findByMap("test");
    }
}
