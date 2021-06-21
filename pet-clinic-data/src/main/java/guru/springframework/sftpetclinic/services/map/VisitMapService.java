package guru.springframework.sftpetclinic.services.map;

import guru.springframework.sftpetclinic.model.Visit;
import guru.springframework.sftpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null) {
            System.out.println("pet id is " + visit.getPet().getId());
            throw new RuntimeException("Incorrect Visit");
        }

        return super.save(visit);
    }

    @Override
    public Visit findById(Long aLong) {
        return super.findByID(aLong);
    }
}