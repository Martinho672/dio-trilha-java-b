import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CepService {
    
    private final CepValidatorFactory validatorFactory;

    @Autowired
    public CepService(CepValidatorFactory validatorFactory) {
        this.validatorFactory = validatorFactory;
    }

    public boolean validateCep(String cep, String country) {
        CepValidator validator = validatorFactory.getValidator(country);
        return validator.isValid(cep);
    }
}
