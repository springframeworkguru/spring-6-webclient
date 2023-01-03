package guru.springframework.client;

import reactor.core.publisher.Flux;

import java.util.Map;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BeerClient {

    Flux<String> listBeer();

    Flux<Map> listBeerMap();
}
