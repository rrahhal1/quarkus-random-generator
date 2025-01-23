package com.redhat.developers.demos.quarkus.service;

import com.redhat.developers.demos.quarkus.model.RandomResponse;
import java.util.UUID;

public class RandomGeneratorService {
  private static final UUID id = UUID.randomUUID();

  public RandomResponse createRandomMessage() {
    return new RandomResponse(id.toString()+"-perfeqwswqddewfwefewsadsdsaswewrewrewctionists---Rea Hfdfdsfdsfdsfds Rahhal 20 7 19wdwqdw93 bla blsdsadsadsasssss---*");
  }
}
