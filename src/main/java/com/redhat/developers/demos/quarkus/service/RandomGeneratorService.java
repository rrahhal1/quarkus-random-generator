package com.redhat.developers.demos.quarkus.service;

import com.redhat.developers.demos.quarkus.model.RandomResponse;
import java.util.UUID;

public class RandomGeneratorService {
  private static final UUID id = UUID.randomUUID();

  public RandomResponse createRandomMessage() {
    return new RandomResponse(id.toString()+"-sss---Rea H Rahhal 20 7 1993 bla blsdsadsadsasssss---*");
  }
}
