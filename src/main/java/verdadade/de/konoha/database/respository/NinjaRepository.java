package verdadade.de.konoha.database.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import verdadade.de.konoha.database.model.NinjaEntity;

public interface NinjaRepository extends JpaRepository<NinjaEntity,Long> {
}
