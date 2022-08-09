package com.zomeli.villanueva.apirestpokeapi.service;

import static com.zomeli.villanueva.apirestpokeapi.utils.Constants.*;

import com.zomeli.villanueva.apirestpokeapi.model.*;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiType;
import com.zomeli.villanueva.apirestpokeapi.model.pokeapi.*;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.apache.commons.lang3.StringUtils;
import retrofit2.Response;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class PokemonApiResponse{


    /**
     * return ResponseEntity<PokeApiResponse> with param PokeApiNamedResourceList and List<PokeApiGetPokemon>.
     *
     * @param pokeApiNamedResourceList PokeApiNamedResourceList
     * @param pokeApiPokemonList List<PokeApiGetPokemon>
     * @return ResponseEntity<PokeApiResponse>.
     */
    public ResponseEntity<PokeApiPokemonResponse> processPokemonResponse(PokeApiNamedResourceList pokeApiNamedResourceList, List<PokeApiGetPokemon> pokeApiPokemonList) {

        return ResponseEntity.ok(
                PokeApiPokemonResponse.builder()
                        .pokemons(pokeApiPokemonList)
                        .count(pokeApiNamedResourceList.getCount())
                        .previous(StringUtils.trimToEmpty(pokeApiNamedResourceList.getPrevious()).replace(URL,HOST_URL))
                        .next(StringUtils.trimToEmpty(pokeApiNamedResourceList.getNext()).replace(URL,HOST_URL))
                        .build());
    }

    /**
     * return ResponseEntity<PokeApiEvolutionResponse> with param Response<PokeApiEvolutionChain>.
     *
     * @param response Response<PokeApiEvolutionChain>
     * @return ResponseEntity<PokeApiEvolutionResponse>
     */
    public ResponseEntity<PokeApiEvolutionResponse> processEvolutionResponse(Response<PokeApiEvolutionChain> response) {
        List<PokeApiGetEvolution> pokeApiGetEvolutionList = new ArrayList<>();

        PokeApiEvolutionChain body = response.body();

        return ResponseEntity.ok(
                PokeApiEvolutionResponse.builder()
                        .id(String.valueOf(body.getId()))
                        .pokemon(body.getChain().getSpecies().getName())
                        .url(StringUtils.trimToEmpty(body.getChain().getSpecies().getUrl()).replace(URL.concat(PATH_POKEMON_SPECIES),HOST_URL.concat(PATH_POKEMON)))
                        .evolutions(buildPokeApiGetEvolution(pokeApiGetEvolutionList,body.getChain().getEvolves_to()))
                        .build());
    }

    /**
     * build buildPokeApiGetEvolution.
     *
     * @param pokeApiGetEvolutionList List<PokeApiGetEvolution>
     * @param evolvesTo List<PokeApiEvolutionDetail>
     * @return List<PokeApiGetEvolution>
     */
    public List<PokeApiGetEvolution> buildPokeApiGetEvolution(List<PokeApiGetEvolution> pokeApiGetEvolutionList,List<PokeApiEvolutionDetail> evolvesTo){

        evolvesTo.forEach(m->{
            pokeApiGetEvolutionList.add(
                    PokeApiGetEvolution.builder()
                            .url(StringUtils.trimToEmpty(m.getSpecies().getUrl()).replace(URL.concat(PATH_POKEMON_SPECIES),HOST_URL.concat(PATH_POKEMON)))
                            .name(m.getSpecies().getName())
                            .build());
            buildPokeApiGetEvolution(pokeApiGetEvolutionList,m.getEvolves_to());
        });

        return pokeApiGetEvolutionList;
    }

    /**
     * return PokeApiGetPokemon with param url and PokeApiPokemon.
     *
     * @param url String
     * @param apiPokemon PokeApiPokemon
     * @return PokeApiGetPokemon
     */
    public PokeApiGetPokemon buildPokeApiPokemon(String url, PokeApiPokemon apiPokemon) {

        return PokeApiGetPokemon.builder()
                .id(String.valueOf(apiPokemon.getId()))
                .name(apiPokemon.getName())
                .url(StringUtils.trimToEmpty(url).replace(URL,HOST_URL))
                .types(apiPokemon.getTypes().stream()
                        .map(PokemonApiResponse::buildPokeApiType)
                        .collect(Collectors.toList()))
                .abilities(apiPokemon.getAbilities().stream()
                        .map(PokemonApiResponse::buildPokeApiAbilities)
                        .collect(Collectors.toList()))
                .weight(String.valueOf(apiPokemon.getWeight()))
                .build();
    }


    /**
     * build buildPokeApiType.
     *
     * @param type PokeApiPokemonType
     * @return PokeApiType
     */
    public static PokeApiType buildPokeApiType(PokeApiPokemonType type){

        return PokeApiType.builder()
                .name(type.getType().getName())
                .url(StringUtils.trimToEmpty(type.getType().getUrl()).replace(URL,HOST_URL))
                .build();
    }

    /**
     * build buildPokeApiAbilities.
     *
     * @param ability PokeApiPokemonAbility
     * @return PokeApiAbilities
     */
    public static PokeApiAbilities buildPokeApiAbilities(PokeApiPokemonAbility ability){

        return PokeApiAbilities.builder()
                .name(ability.getAbility().getName())
                .url(StringUtils.trimToEmpty(ability.getAbility().getUrl()).replace(URL,HOST_URL))
                .build();
    }


}
