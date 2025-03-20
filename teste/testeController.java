import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/testes")
public class testeController {

    @Autowired
    private testeService testeService;

    @GetMapping
    public List<teste> getAll() {
        return testeService.findAll();
    }

    @PostMapping
    public teste create(@RequestBody teste teste) {
        return testeService.save(teste);
    }

    @GetMapping("/{id}")
    public teste getById(@PathVariable Long id) {
        return testeService.findById(id);
    }

    @PutMapping("/{id}")
    public teste update(@PathVariable Long id, @RequestBody teste teste) {
        teste.setId(id);
        return testeService.save(teste);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        testeService.deleteById(id);
    }
}
