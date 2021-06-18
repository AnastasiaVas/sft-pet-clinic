package guru.springframework.sftpetclinic.repositories;

import guru.springframework.sftpetclinic.model.Pet;
import guru.springframework.sftpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}