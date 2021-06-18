package guru.springframework.sftpetclinic.repositories;

import guru.springframework.sftpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}