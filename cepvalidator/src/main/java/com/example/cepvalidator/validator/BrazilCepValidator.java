import org.springframework.stereotype.Component;

@Component
public class BrazilCepValidator implements CepValidator {
    @Override
    public boolean isValid(String cep) {
        return cep != null && cep.matches("\\d{5}-\\d{3}");
    }
}
