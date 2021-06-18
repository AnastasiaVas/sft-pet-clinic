package guru.springframework.sftpetclinic.repositories;

import guru.springframework.sftpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}