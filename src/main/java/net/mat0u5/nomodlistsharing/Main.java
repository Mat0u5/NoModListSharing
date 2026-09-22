package net.mat0u5.nomodlistsharing;

import net.mat0u5.nomodlistsharing.platform.Platform;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Map;

//? fabric {
import net.mat0u5.nomodlistsharing.platform.fabric.FabricPlatform;
//?} neoforge {
/*import net.mat0u5.nomodlistsharing.platform.neoforge.NeoforgePlatform;
 *///?} forge {
/*import net.mat0u5.nomodlistsharing.platform.forge.ForgePlatform;
*///?}

public class Main {

	public static final String MOD_ID = "nomodlistsharing";
	public static final String MOD_VERSION = "1.0.0";
	public static final String MOD_FRIENDLY_NAME = "No Mod List Sharing";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	private static final Platform PLATFORM = createPlatformInstance();

	public static void onInitialize() {
		LOGGER.info("Initializing {} on {}", MOD_ID, platform().loader());
		LOGGER.info("{}: { version: {}; friendly_name: {} }", MOD_ID, MOD_VERSION, MOD_FRIENDLY_NAME);

	}

	public static void onInitializeClient() {
		LOGGER.info("Initializing {} Client on {}", MOD_ID, platform().loader());
		LOGGER.info("{}: { version: {}; friendly_name: {} }", MOD_ID, MOD_VERSION, MOD_FRIENDLY_NAME);
	}

	static Platform platform() {
		return PLATFORM;
	}

	private static Platform createPlatformInstance() {
		//? fabric {
		return new FabricPlatform();
		//?} neoforge {
		/*return new NeoforgePlatform();
		 *///?} forge {
		/*return new ForgePlatform();
		*///?}
	}
}
