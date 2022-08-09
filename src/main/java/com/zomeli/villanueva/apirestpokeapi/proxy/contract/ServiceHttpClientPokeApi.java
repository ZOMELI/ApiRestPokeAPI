package com.zomeli.villanueva.apirestpokeapi.proxy.contract;


import com.zomeli.villanueva.apirestpokeapi.model.pokeapi.PokeApiEvolutionChain;
import com.zomeli.villanueva.apirestpokeapi.model.pokeapi.PokeApiNamedResourceList;
import com.zomeli.villanueva.apirestpokeapi.model.pokeapi.PokeApiPokemon;
import io.reactivex.Single;
import org.springframework.cache.annotation.Cacheable;
import retrofit2.http.GET;
import retrofit2.Response;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ServiceHttpClientPokeApi {
    @GET("pokemon/")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Single<Response<PokeApiNamedResourceList>> list(@Query("limit") int limit, @Query("offset") int offset);

    @GET("pokemon/{id}/")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Single<PokeApiPokemon> getPokemon(@Path(value="id") String id);

    @GET("evolution-chain/{id}/")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Single<Response<PokeApiEvolutionChain>> getEvolution(@Path(value="id") String id);

}
