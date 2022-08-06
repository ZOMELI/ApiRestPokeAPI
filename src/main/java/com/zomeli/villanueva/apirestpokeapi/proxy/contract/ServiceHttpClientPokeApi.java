package com.zomeli.villanueva.apirestpokeapi.proxy.contract;


import com.zomeli.villanueva.apirestpokeapi.api.PokeApiNamedResourceList;
import io.reactivex.Single;

import org.springframework.cache.annotation.Cacheable;
import retrofit2.http.GET;
import retrofit2.Response;
import retrofit2.http.Query;

public interface ServiceHttpClientPokeApi {

    @GET("pokemon/")
    @Cacheable(value = "cache", key = "#root.methodName+#root.args")
    Single<Response<PokeApiNamedResourceList>> list(@Query("limit") int limit, @Query("offset") int offset);

}
