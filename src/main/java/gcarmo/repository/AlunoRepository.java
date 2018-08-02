package gcarmo.repository;

import gcarmo.model.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, UUID> {
}
