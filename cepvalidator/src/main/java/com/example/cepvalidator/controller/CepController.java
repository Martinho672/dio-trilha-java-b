import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cep")
public class CepController {

    private final CepService cepService;

    @Autowired
    public CepController(CepService cepService) {
        this.cepService = cepService;
    }

    @PostMapping("/validate")
    public CepResponse validateCep(@RequestBody CepRequest request,
                                   @RequestParam(defaultValue = "brazilCepValidator") String country) {
        boolean isValid = cepService.validateCep(request.getCep(), country);
        return new CepResponse(isValid ? "CEP válido" : "CEP inválido");
    }
}
