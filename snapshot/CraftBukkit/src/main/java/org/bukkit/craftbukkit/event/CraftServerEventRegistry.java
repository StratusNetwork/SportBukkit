package org.bukkit.craftbukkit.event;

import org.bukkit.event.SimpleEventRegistry;
import tc.oc.minecraft.api.server.ServerExceptionHandler;

import javax.inject.Inject;

/**
 * Used internally to register event listeners that don't belong to any plugin
 */
public class CraftServerEventRegistry extends SimpleEventRegistry {

    @Inject
    CraftServerEventRegistry(ServerExceptionHandler exceptionHandler) {
        super(exceptionHandler);
    }
}
