package verdadade.de.konoha.database.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import verdadade.de.konoha.database.model.MissaoEntity;

@Repository
public interface MissaoRepository extends JpaRepository<MissaoEntity, Long> {

}
