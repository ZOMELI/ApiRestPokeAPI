package com.zomeli.villanueva.apirestpokeapi.controller;

import com.zomeli.villanueva.apirestpokeapi.model.ExceptionType;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiEvolutionResponse;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiGetPokemon;
import com.zomeli.villanueva.apirestpokeapi.model.PokeApiPokemonResponse;
import com.zomeli.villanueva.apirestpokeapi.service.PokemonApiService;
import io.reactivex.Maybe;
import io.reactivex.functions.Function;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@EnableAutoConfiguration
public class PokemonApiController{

    @Autowired
    PokemonApiService service;

    /**
     * GET /pokemon : Pokemon&#39;s queries expose their basic information, such as Type, Weight, and Ability List.
     *
     * @param unICAServiceId If this API is used via a platform acting as a common entry point to different OBs, this identifier is used to route the request to the corresponding OB environment (optional)
     * @param unICAApplication Identifier for the system originating the request (optional)
     * @param UNICA_PID Unique identifier for the process or execution flow (optional)
     * @param unICAUser Identifies the user when the request is received from a trusted application and no end user authorization token is used but just an application token (optional)
     * @param ocpApimSubscriptionKey Subscription key (optional)
     * @param xIBMClientId Client ID required for authentication (optional)
     * @param authorization Including the proof of access (using OAuth2.0 security model) to guarantee that the consumer has privileges to access the entity database (optional)
     * @param limit To limit the maximum number of results to be included in the response. Use together with offset for pagination. (optional)
     * @param offset To apply an offset in the results to be included in the response. Use together with limit for pagination (optional)
     * @return successful response. (status code 200)
     *         or Client Error (status code 400)
     *         or Not Found Error (status code 404)
     *         or Server Error (status code 500)
     *         or Service Unavailable (status code 503)
     */
    @ApiOperation(value = "Pokemon's queries expose their basic information, such as Type, Weight, and Ability List.", nickname = "getPokemon", notes = "", response = PokeApiPokemonResponse.class, responseContainer = "List", tags={ "pokemonList", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful response.", response = PokeApiPokemonResponse.class),
            @ApiResponse(code = 400, message = "Client Error", response = ExceptionType.class),
            @ApiResponse(code = 404, message = "Not Found Error", response = ExceptionType.class),
            @ApiResponse(code = 500, message = "Server Error", response = ExceptionType.class),
            @ApiResponse(code = 503, message = "Service Unavailable", response = ExceptionType.class) })
    @GetMapping(
            value = "/pokemon",
            produces = { "application/json" }
    )
    public Maybe<ResponseEntity<PokeApiPokemonResponse>> getPokemonApi(@ApiParam(value = "If this API is used via a platform acting as a common entry point to different OBs, this identifier is used to route the request to the corresponding OB environment") @RequestHeader(value = "UNICA-ServiceId", required = false) String unICAServiceId, @ApiParam(value = "Identifier for the system originating the request") @RequestHeader(value = "UNICA-Application", required = false) String unICAApplication, @ApiParam(value = "Unique identifier for the process or execution flow") @RequestHeader(value = "UNICA-PID", required = false) String UNICA_PID, @ApiParam(value = "Identifies the user when the request is received from a trusted application and no end user authorization token is used but just an application token") @RequestHeader(value = "UNICA-User", required = false) String unICAUser, @ApiParam(value = "Subscription key") @RequestHeader(value = "Ocp-Apim-Subscription-Key", required = false) String ocpApimSubscriptionKey, @ApiParam(value = "Client ID required for authentication") @RequestHeader(value = "X-IBM-Client-Id", required = false) String xIBMClientId, @ApiParam(value = "Including the proof of access (using OAuth2.0 security model) to guarantee that the consumer has privileges to access the entity database") @RequestHeader(value = "Authorization", required = false) String authorization, @ApiParam(value = "To limit the maximum number of results to be included in the response. Use together with offset for pagination.") @Valid @RequestParam(value = "limit", required = false) Integer limit, @ApiParam(value = "To apply an offset in the results to be included in the response. Use together with limit for pagination") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
       return service.getPokemonList(limit, offset);
    }

    /**
     * GET /pokemon : Pokemon&#39;s queries expose their basic Evolution pokemon's.
     *
     * @param unICAServiceId If this API is used via a platform acting as a common entry point to different OBs, this identifier is used to route the request to the corresponding OB environment (optional)
     * @param unICAApplication Identifier for the system originating the request (optional)
     * @param UNICA_PID Unique identifier for the process or execution flow (optional)
     * @param unICAUser Identifies the user when the request is received from a trusted application and no end user authorization token is used but just an application token (optional)
     * @param ocpApimSubscriptionKey Subscription key (optional)
     * @param xIBMClientId Client ID required for authentication (optional)
     * @param authorization Including the proof of access (using OAuth2.0 security model) to guarantee that the consumer has privileges to access the entity database (optional)
     * @param id Identifier of pokemon's Evolution. (optional)
     * @return successful response. (status code 200)
     *         or Client Error (status code 400)
     *         or Not Found Error (status code 404)
     *         or Server Error (status code 500)
     *         or Service Unavailable (status code 503)
     */
    @ApiOperation(value = "Pokemon's queries expose their Evolution pokemon's", nickname = "getEvolutionPokemonApi", notes = "", response = PokeApiPokemonResponse.class, responseContainer = "List", tags={ "pokemonEvolutionList", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful response.", response = PokeApiEvolutionResponse.class),
            @ApiResponse(code = 400, message = "Client Error", response = ExceptionType.class),
            @ApiResponse(code = 404, message = "Not Found Error", response = ExceptionType.class),
            @ApiResponse(code = 500, message = "Server Error", response = ExceptionType.class),
            @ApiResponse(code = 503, message = "Service Unavailable", response = ExceptionType.class) })
    @GetMapping(
            value = "/evolution/{id}",
            produces = { "application/json" }
    )
    public Maybe<ResponseEntity<PokeApiEvolutionResponse>> getEvolutionPokemonApi(@ApiParam(value = "If this API is used via a platform acting as a common entry point to different OBs, this identifier is used to route the request to the corresponding OB environment") @RequestHeader(value = "UNICA-ServiceId", required = false) String unICAServiceId, @ApiParam(value = "Identifier for the system originating the request") @RequestHeader(value = "UNICA-Application", required = false) String unICAApplication, @ApiParam(value = "Unique identifier for the process or execution flow") @RequestHeader(value = "UNICA-PID", required = false) String UNICA_PID, @ApiParam(value = "Identifies the user when the request is received from a trusted application and no end user authorization token is used but just an application token") @RequestHeader(value = "UNICA-User", required = false) String unICAUser, @ApiParam(value = "Subscription key") @RequestHeader(value = "Ocp-Apim-Subscription-Key", required = false) String ocpApimSubscriptionKey, @ApiParam(value = "Client ID required for authentication") @RequestHeader(value = "X-IBM-Client-Id", required = false) String xIBMClientId, @ApiParam(value = "Including the proof of access (using OAuth2.0 security model) to guarantee that the consumer has privileges to access the entity database") @RequestHeader(value = "Authorization", required = false) String authorization, @ApiParam(value = "Identifier of pokemon's Evolution") @PathVariable(value = "id", required = false) String id) {
        return service.getPokemonEvolutionList(id);
    }



    /**
     * GET /pokemon : Pokemon's queries expose their detail the Pokemon's.
     *
     * @param unICAServiceId If this API is used via a platform acting as a common entry point to different OBs, this identifier is used to route the request to the corresponding OB environment (optional)
     * @param unICAApplication Identifier for the system originating the request (optional)
     * @param UNICA_PID Unique identifier for the process or execution flow (optional)
     * @param unICAUser Identifies the user when the request is received from a trusted application and no end user authorization token is used but just an application token (optional)
     * @param ocpApimSubscriptionKey Subscription key (optional)
     * @param xIBMClientId Client ID required for authentication (optional)
     * @param authorization Including the proof of access (using OAuth2.0 security model) to guarantee that the consumer has privileges to access the entity database (optional)
     * @param id Identifier of pokemon's Evolution. (optional)
     * @return successful response. (status code 200)
     *         or Client Error (status code 400)
     *         or Not Found Error (status code 404)
     *         or Server Error (status code 500)
     *         or Service Unavailable (status code 503)
     */
    @ApiOperation(value = "Pokemon's queries expose their detail the Pokemon's", nickname = "getEvolutionPokemonApi", notes = "", response = PokeApiPokemonResponse.class, responseContainer = "List", tags={ "pokemonEvolutionList", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "successful response.", response = PokeApiGetPokemon.class),
            @ApiResponse(code = 400, message = "Client Error", response = ExceptionType.class),
            @ApiResponse(code = 404, message = "Not Found Error", response = ExceptionType.class),
            @ApiResponse(code = 500, message = "Server Error", response = ExceptionType.class),
            @ApiResponse(code = 503, message = "Service Unavailable", response = ExceptionType.class) })
    @GetMapping(
            value = "/pokemon/{id}",
            produces = { "application/json" }
    )
    public Maybe<ResponseEntity<PokeApiGetPokemon>> getPokemonDetailApi(@ApiParam(value = "If this API is used via a platform acting as a common entry point to different OBs, this identifier is used to route the request to the corresponding OB environment") @RequestHeader(value = "UNICA-ServiceId", required = false) String unICAServiceId, @ApiParam(value = "Identifier for the system originating the request") @RequestHeader(value = "UNICA-Application", required = false) String unICAApplication, @ApiParam(value = "Unique identifier for the process or execution flow") @RequestHeader(value = "UNICA-PID", required = false) String UNICA_PID, @ApiParam(value = "Identifies the user when the request is received from a trusted application and no end user authorization token is used but just an application token") @RequestHeader(value = "UNICA-User", required = false) String unICAUser, @ApiParam(value = "Subscription key") @RequestHeader(value = "Ocp-Apim-Subscription-Key", required = false) String ocpApimSubscriptionKey, @ApiParam(value = "Client ID required for authentication") @RequestHeader(value = "X-IBM-Client-Id", required = false) String xIBMClientId, @ApiParam(value = "Including the proof of access (using OAuth2.0 security model) to guarantee that the consumer has privileges to access the entity database") @RequestHeader(value = "Authorization", required = false) String authorization, @ApiParam(value = "Identifier of pokemon for view detail") @PathVariable(value = "id", required = false) String id) {
        return service.getPokemonDetailList(id);
    }


}
