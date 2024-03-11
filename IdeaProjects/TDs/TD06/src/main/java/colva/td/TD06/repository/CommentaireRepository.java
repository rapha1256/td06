package colva.td.TD06.repository;

import colva.td.TD06.entity.Commentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
}
