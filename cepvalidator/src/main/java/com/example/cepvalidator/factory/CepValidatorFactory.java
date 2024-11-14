import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CepValidatorFactory {
    
    private final Map<String, CepValidator> validators;

    @Autowired
    public CepValidatorFactory(Map<String, CepValidator> validators) {
        this.validators = validators;
    }

    public CepValidator getValidator(String country) {
        // Default para CEPs brasileiros
        return validators.getOrDefault(country, validators.get("brazilCepValidator"));
    }
}
