package guru.springframework.sftpetclinic.repositories;

import guru.springframework.sftpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}