import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class testeService {

    @Autowired
    private testeRepository testeRepository;

    public List<teste> findAll() {
        return testeRepository.findAll();
    }

    public teste save(teste teste) {
        return testeRepository.save(teste);
    }

    public teste findById(Long id) {
        return testeRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id) {
        testeRepository.deleteById(id);
    }
}
