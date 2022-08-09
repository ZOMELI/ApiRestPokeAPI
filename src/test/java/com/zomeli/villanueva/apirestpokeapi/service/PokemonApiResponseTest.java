package com.zomeli.villanueva.apirestpokeapi.service;

import static com.zomeli.villanueva.apirestpokeapi.TestUtils.*;
import static org.junit.jupiter.api.Assertions.assertAll;

import com.zomeli.villanueva.apirestpokeapi.model.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class PokemonApiResponseTest {
    @InjectMocks
    PokemonApiResponse response;
    @Test
    @DisplayName("return ResponseEntity<PokeApiPokemonResponse> With Param PokeApiNamedResourceList And List<PokeApiGetPokemon> Is Ok")
    public void returnResponseEntityPokeApiPokemonResponseWithParamPokeApiNamedResourceListAndPokeApiGetPokemonListIsOk(){

        ResponseEntity<PokeApiPokemonResponse> responsePokemon
                = response.processPokemonResponse(buildPokeApiNamedResourceList(), buildPokeApiGetPokemonList());

        assertAll("Validate ResponseEntity<PokeApiPokemonResponse>",
                () -> Assertions.assertThat(responsePokemon.getStatusCode()).isEqualTo(HttpStatus.OK),

                () -> Assertions.assertThat(responsePokemon.getBody().getCount()).isEqualTo(1154),

                () -> Assertions.assertThat(responsePokemon.getBody().getPokemons().get(0)
                        .getName()).isEqualTo("charmeleon"),

                () -> Assertions.assertThat(responsePokemon.getBody()
                        .getPokemons().get(0)
                        .getTypes().get(0).getName()).isEqualTo("fire"),

                () -> Assertions.assertThat(responsePokemon.getBody()
                        .getPokemons().get(0)
                        .getAbilities().get(1).getName()).isEqualTo("solar-power")
        );
    }

    @Test
    @DisplayName("return ResponseEntity<PokeApiEvolutionResponse> With Param Response<PokeApiEvolutionChain> Is Ok")
    public void returnResponseEntityPokeApiEvolutionResponseWithParamPokeApiEvolutionChainListIsOk(){

        ResponseEntity<PokeApiEvolutionResponse> responseEvolution
                = response.processEvolutionResponse(buildPokeApiEvolutionResponse());

        assertAll("Validate ResponseEntity<PokeApiEvolutionResponse>",
                () -> Assertions.assertThat(responseEvolution.getStatusCode()).isEqualTo(HttpStatus.OK),

                () -> Assertions.assertThat(responseEvolution.getBody().getId()).isEqualTo("10"),

                () -> Assertions.assertThat(responseEvolution.getBody().getPokemon()).isEqualTo("pichu"),

                () -> Assertions.assertThat(responseEvolution.getBody()
                        .getEvolutions().get(0).getName()).isEqualTo("pikachu"),

                () -> Assertions.assertThat(responseEvolution.getBody()
                        .getEvolutions().get(1).getName()).isEqualTo("raichu")
        );
    }

    @Test
    @DisplayName("return List<PokeApiGetEvolution> With List<PokeApiGetEvolution> And List<PokeApiEvolutionDetail> Is Ok")
    public void returnPokeApiGetEvolutionListWithParamPokeApiGetEvolutionListAndPokeApiEvolutionDetailListIsOk(){

        List<PokeApiGetEvolution> pokeApiGetEvolutionList
                = response.buildPokeApiGetEvolution(buildPokeApiGetEvolutionList(),buildPokeApiEvolutionDetailList());

        assertAll("Validate List<PokeApiGetEvolution>",
                () -> Assertions.assertThat(pokeApiGetEvolutionList.size()).isGreaterThan(0),

                () -> Assertions.assertThat(pokeApiGetEvolutionList.get(1).getName()).isEqualTo("pikachu")

        );
    }

    @Test
    @DisplayName("return PokeApiGetPokemon With Param Url And PokeApiPokemon Is Ok")
    public void returnPokeApiGetPokemonWithParamUrlAndPokeApiPokemonIsOk(){

        PokeApiGetPokemon pokeApiGetPokemon
                = response.buildPokeApiPokemon("https://zomeli-villanueva-48491134/pokemon-species/4/",buildPokeApiPokemon());

        assertAll("Validate PokeApiGetPokemon",
                () -> Assertions.assertThat(pokeApiGetPokemon.getTypes().get(0).getName()).isEqualTo("fire"),

                () -> Assertions.assertThat(pokeApiGetPokemon.getAbilities().get(0).getName()).isEqualTo("blaze")
        );
    }

    @Test
    @DisplayName("return PokeApiType With Param PokeApiPokemonType Is Ok")
    public void returnPokeApiTypeWithParamPokeApiPokemonTypeIsOk(){

        PokeApiType pokeApiType
                = response.buildPokeApiType(buildPokeApiPokemonType());

        assertAll("Validate PokeApiType",
                () -> Assertions.assertThat(pokeApiType.getName()).isEqualTo("fire"),

                () -> Assertions.assertThat(pokeApiType.getUrl()).isEqualTo("https://boiling-garden-44541.herokuapp.com/type/10/")
        );
    }

    @Test
    @DisplayName("return PokeApiAbilities With PokeApiPokemonAbility Is Ok")
    public void returnPokeApiAbilitiesWithPokeApiPokemonAbilityIsOk(){

        PokeApiAbilities pokeApiAbilities
                = response.buildPokeApiAbilities(buildPokeApiPokemonAbility());

        assertAll("Validate PokeApiAbilities",
                () -> Assertions.assertThat(pokeApiAbilities.getName()).isEqualTo("blaze"),

                () -> Assertions.assertThat(pokeApiAbilities.getUrl()).isEqualTo("https://boiling-garden-44541.herokuapp.com/ability/66/")
        );
    }

}