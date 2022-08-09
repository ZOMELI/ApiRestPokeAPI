package com.zomeli.villanueva.apirestpokeapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zomeli.villanueva.apirestpokeapi.model.*;
import com.zomeli.villanueva.apirestpokeapi.model.pokeapi.*;
import org.springframework.http.ResponseEntity;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestUtils {


    private static final ObjectMapper mapper;

    static {
        mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
    }

    /**
     * Method.
     *
     * @return T
     */
    public static <T> T readDataFromFile(String fileName, Class<T> className) throws IOException {
        return mapper.readValue(
                TestUtils.class.getClassLoader().getResourceAsStream(fileName), className);
    }

    public static PokeApiNamedResourceList buildPokeApiNamedResourceList(){

        List<PokeApiNamedApiResource> apiResourceList = new ArrayList<>();
        apiResourceList.add(
                PokeApiNamedApiResource.builder()
                        .name("charmeleon")
                        .url("https://pokeapi.co/api/v2/pokemon/5/")
                        .build());

        return PokeApiNamedResourceList.builder()
                .count(1154)
                .next("https://pokeapi.co/api/v2/pokemon?offset=7&limit=3")
                .previous("https://pokeapi.co/api/v2/pokemon?offset=1&limit=3")
                .results(apiResourceList)
                .build();
    }

    public static List<PokeApiGetPokemon> buildPokeApiGetPokemonList(){
        List<PokeApiGetPokemon> pokeApiGetPokemonList= new ArrayList<>();
        List<PokeApiAbilities> apiAbilitiesList= new ArrayList<>();
        List<PokeApiType> pokeApiTypeList= new ArrayList<>();

        apiAbilitiesList.add(
                PokeApiAbilities.builder()
                        .url("https://pokeapi.co/api/v2/ability/66/")
                        .name("blaze")
                        .build());

        apiAbilitiesList.add(
                PokeApiAbilities.builder()
                        .url("https://pokeapi.co/api/v2/ability/94/")
                        .name("solar-power")
                        .build());

        pokeApiTypeList.add(
                PokeApiType.builder()
                        .url("https://pokeapi.co/api/v2/type/10/")
                        .name("fire")
                        .build());

       pokeApiGetPokemonList.add(
               PokeApiGetPokemon.builder()
                       .id("5")
                       .name("charmeleon")
                       .weight("190")
                       .url("https://pokeapi.co/api/v2/pokemon-species/5/")
                       .abilities(apiAbilitiesList)
                       .types(pokeApiTypeList)
                       .build());
       return pokeApiGetPokemonList;
    }


    public static Response<PokeApiEvolutionChain> buildPokeApiEvolutionResponse(){

        List<PokeApiEvolutionDetail> pokeApiEvolutionDetailList1 = new ArrayList<>();
        List<PokeApiEvolutionDetail> pokeApiEvolutionDetailList2 = new ArrayList<>();

        pokeApiEvolutionDetailList2.add(
                PokeApiEvolutionDetail.builder()
                        .is_baby(false)
                        .species(
                                PokeApiNamedApiResource.builder()
                                        .url("https://pokeapi.co/api/v2/pokemon-species/26/")
                                        .name("raichu")
                                        .build())
                        .evolves_to(new ArrayList<>())
                        .build());

        pokeApiEvolutionDetailList1.add(
                PokeApiEvolutionDetail.builder()
                        .is_baby(false)
                        .species(
                                PokeApiNamedApiResource.builder()
                                .url("https://pokeapi.co/api/v2/pokemon-species/25/")
                                .name("pikachu")
                                .build())
                        .evolves_to(pokeApiEvolutionDetailList2)
                        .build());

        return Response.success(
                PokeApiEvolutionChain.builder()
                        .id(10)
                        .chain(PokeApiChainLink.builder()
                                .is_baby(true)
                                .species(
                                        PokeApiNamedApiResource.builder()
                                                .url("https://pokeapi.co/api/v2/pokemon-species/172/")
                                                .name("pichu")
                                                .build())
                                .evolves_to(pokeApiEvolutionDetailList1)
                                .build())
                        .build());
    }


    public static List<PokeApiGetEvolution> buildPokeApiGetEvolutionList(){
        List<PokeApiGetEvolution> pokeApiGetEvolutionList = new ArrayList<>();

        pokeApiGetEvolutionList.add(
                PokeApiGetEvolution.builder()
                        .id("10")
                        .url("https://pokeapi.co/api/v2/pokemon-species/172/")
                        .name("pichu")
                        .build());

        return pokeApiGetEvolutionList;
    }

    public static List<PokeApiEvolutionDetail> buildPokeApiEvolutionDetailList(){
        List<PokeApiEvolutionDetail> pokeApiEvolutionDetailList1 = new ArrayList<>();
        List<PokeApiEvolutionDetail> pokeApiEvolutionDetailList2 = new ArrayList<>();

        pokeApiEvolutionDetailList2.add(
                PokeApiEvolutionDetail.builder()
                        .is_baby(false)
                        .species(
                                PokeApiNamedApiResource.builder()
                                        .url("https://pokeapi.co/api/v2/pokemon-species/26/")
                                        .name("raichu")
                                        .build())
                        .evolves_to(new ArrayList<>())
                        .build());

        pokeApiEvolutionDetailList1.add(
                PokeApiEvolutionDetail.builder()
                        .is_baby(false)
                        .species(
                                PokeApiNamedApiResource.builder()
                                        .url("https://pokeapi.co/api/v2/pokemon-species/25/")
                                        .name("pikachu")
                                        .build())
                        .evolves_to(pokeApiEvolutionDetailList2)
                        .build());

        return pokeApiEvolutionDetailList1;
    }


    public static PokeApiPokemon buildPokeApiPokemon(){
        List<PokeApiPokemonAbility> pokeApiPokemonAbilityList = new ArrayList<>();
        List<PokeApiPokemonType> pokeApiPokemonTypeList = new ArrayList<>();

        pokeApiPokemonAbilityList.add(
                PokeApiPokemonAbility.builder()
                        .ability(
                                PokeApiNamedApiResource.builder()
                                        .name("blaze")
                                        .url("https://pokeapi.co/api/v2/ability/66/")
                                        .build())
                        .is_hidden(false)
                        .build());



        pokeApiPokemonTypeList.add(
                PokeApiPokemonType.builder()
                        .slot(1)
                        .type(
                                PokeApiNamedApiResource.builder()
                                        .name("fire")
                                        .url("https://pokeapi.co/api/v2/type/10/")
                                        .build())
                        .build());


        return PokeApiPokemon.builder()
                .id(5)
                .name("charmeleon")
                .abilities(pokeApiPokemonAbilityList)
                .base_experience(142)
                .height(11)
                .types(pokeApiPokemonTypeList)
                .build();
    }

    public static PokeApiPokemonType buildPokeApiPokemonType(){

        return PokeApiPokemonType.builder()
                .type(PokeApiNamedApiResource.builder()
                        .name("fire")
                        .url("https://pokeapi.co/api/v2/type/10/")
                        .build())
                .slot(1)
                .build();
    }

    public static PokeApiPokemonAbility buildPokeApiPokemonAbility(){
        return PokeApiPokemonAbility.builder()
                .ability(PokeApiNamedApiResource.builder()
                        .name("blaze")
                        .url("https://pokeapi.co/api/v2/ability/66/")
                        .build())
                .is_hidden(false)
                .slot(1)
                .build();
    }




}
