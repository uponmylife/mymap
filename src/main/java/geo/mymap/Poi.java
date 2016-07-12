package geo.mymap;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@Data
@NoArgsConstructor
public class Poi {
    private static final String SEQUENCE = "poi_id_seq";
    @Id
    @SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE)
    @GeneratedValue(generator = SEQUENCE)
    private Long id;
    private String map;
    private Double lat;
    private Double lng;
    private String title;
    private String content;
    private String link;

    public Poi(String map, Double lat, Double lng) {
        this.map = map;
        this.lat = lat;
        this.lng = lng;
    }
}

/*
CREATE TABLE poi (
    id serial PRIMARY KEY,
    map varchar(20) NOT NULL,
    lat numeric(9,6) NOT NULL,
    lng numeric(9,6) NOT NULL,
    title varchar(20),
    content text,
    link text
);
 */