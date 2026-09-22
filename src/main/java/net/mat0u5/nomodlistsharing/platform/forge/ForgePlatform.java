package net.mat0u5.nomodlistsharing.platform.forge;

//? forge {

/*import net.mat0u5.nomodlistsharing.platform.Platform;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.fml.loading.LoadingModList;

public class ForgePlatform implements Platform {
	@Override
	public boolean isModLoaded(String modId) {
		try {
			return LoadingModList.getModFileById(modId) != null;
		} catch (Throwable ignored) {}

		try {
			return ModList.isLoaded(modId);
		} catch (Throwable ignored) {}
		return false;
	}

	@Override
	public ModLoader loader() {
		return ModLoader.FORGE;
	}

	@Override
	public String mcVersion() {
		return "";
	}

	@Override
	public boolean isDevelopmentEnvironment() {
		return !FMLLoader.isProduction();
	}

	@Override
	public boolean isClient() {
		return FMLEnvironment.dist.isClient();
	}
}
*///?}
