package ripplehire.repository;
import ripplehire.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
    // all crude database method
}
