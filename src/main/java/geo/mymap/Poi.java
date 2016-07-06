package geo.mymap;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Poi {
    @Id
    private Long id;
    private String map;
    private Double lat;
    private Double lng;
    private String title;
    private String content;
    private String link;
}

/*
CREATE TABLE poi (
    id serial PRIMARY KEY,
    map varchar(20) NOT NULL,
    lat numeric(9,6) NOT NULL,
    lng numeric(9,6) NOT NULL,
    title varchar(20) NOT NULL,
    content text,
    link text
);
 */