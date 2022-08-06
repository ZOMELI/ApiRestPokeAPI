package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class PokeApiNamedApiResource implements Serializable {
    private String name;
    private String url;
}
