import java.util.Map;

public record Cotacao(String base_code, String target_code, Float conversion_rate, Float conversion_result) {
}
