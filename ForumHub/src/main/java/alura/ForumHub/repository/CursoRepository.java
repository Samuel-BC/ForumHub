package alura.ForumHub.repository;

import alura.ForumHub.model.entities.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {

    // procurar por nome ignorando case
    Curso findByNomeIgnoreCase(String nome);
}
