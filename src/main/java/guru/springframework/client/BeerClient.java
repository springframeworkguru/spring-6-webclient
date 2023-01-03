package guru.springframework.client;

import reactor.core.publisher.Flux;

/**
 * Created by jt, Spring Framework Guru.
 */
public interface BeerClient {

    Flux<String> listBeer();
}
