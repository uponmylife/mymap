package geo.mymap;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PoiRepository extends CrudRepository<Poi, Long> {
    List<Poi> findByMap(String map);
}
