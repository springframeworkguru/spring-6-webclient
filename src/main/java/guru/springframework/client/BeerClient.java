package guru.springframework.client;

import com.fasterxml.jackson.databind.JsonNode;
import guru.springframework.model.BeerDTO;
import reactor.core.publisher.Flux;

import java.util.Map;
import java.util.concurrent.Flow;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BeerClient {

    Flux<String> listBeer();

    Flux<Map> listBeerMap();

    Flux<JsonNode> listBeersJsonNode();

    Flux<BeerDTO> listBeerDtos();
}
