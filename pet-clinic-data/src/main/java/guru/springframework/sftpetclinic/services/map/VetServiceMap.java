package guru.springframework.sftpetclinic.services.map;

import guru.springframework.sftpetclinic.model.Vet;
import guru.springframework.sftpetclinic.services.VetService;
import guru.springframework.sftpetclinic.model.Vet;
import guru.springframework.sftpetclinic.services.VetService;
import guru.springframework.sftpetclinic.services.map.AbstractMapService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }
}