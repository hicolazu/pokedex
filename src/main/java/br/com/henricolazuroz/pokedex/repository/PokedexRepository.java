package br.com.henricolazuroz.pokedex.repository;

import br.com.henricolazuroz.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository<Pokemon, String> {
}
