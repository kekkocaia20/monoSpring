package springPJ.mvc.monoSpring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springPJ.mvc.monoSpring.model.Utente;

@Repository
public interface IRepoUtente extends JpaRepository<Utente, Integer>{

}
