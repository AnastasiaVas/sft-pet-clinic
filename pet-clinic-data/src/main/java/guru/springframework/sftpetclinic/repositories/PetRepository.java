package guru.springframework.sftpetclinic.repositories;

import guru.springframework.sftpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}