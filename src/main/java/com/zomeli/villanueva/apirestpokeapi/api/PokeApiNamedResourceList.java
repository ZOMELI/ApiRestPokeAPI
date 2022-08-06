package com.zomeli.villanueva.apirestpokeapi.api;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
public class PokeApiNamedResourceList implements Serializable {
    private Integer count;
    private String next;
    private String previous;
    private List<PokeApiNamedApiResource> results;
}
