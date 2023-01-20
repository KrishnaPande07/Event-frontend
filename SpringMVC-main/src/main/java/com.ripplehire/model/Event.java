package ripplehire.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="events")
public class Event {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private Long id;
    @Column(name ="event_name")
    private String eventname;

    @Column(name = "event_location")
    private String eventlocation;

    @Column(name="date")
    private String date;

}
