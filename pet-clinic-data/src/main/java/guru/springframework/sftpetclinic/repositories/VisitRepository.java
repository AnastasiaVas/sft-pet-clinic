package guru.springframework.sftpetclinic.repositories;

import guru.springframework.sftpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}