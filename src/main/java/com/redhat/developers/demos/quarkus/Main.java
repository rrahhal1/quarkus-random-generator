package com.redhat.developers.demos.quarkus;

import java.util.logging.Level;
import java.util.logging.Logger;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import io.vertx.core.logging.LoggerFactory;

@QuarkusMain
public class Main {
	
	static Logger logger=Logger.getLogger(Main.class.getName());
    public static void main(String... args) {
        logger.log(Level.FINE, "Starting  app  ...");
        Quarkus.run(args);
    }
}