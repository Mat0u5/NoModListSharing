package net.mat0u5.nomodlistsharing.mixin;

import dev.kikugie.fletching_table.annotation.MixinEnvironment;
import net.minecraft.network.protocol.common.custom.ModListPayload;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(value = ModListPayload.class, priority = 1)
@MixinEnvironment(type = MixinEnvironment.Env.MAIN)
public class ModListPayloadMixin {

	@Inject(method = "createClient", at = @At("HEAD"), cancellable = true)
	private static void changePacket(CallbackInfoReturnable<ModListPayload> cir) {
		//cir.setReturnValue(new ModListPayload(Map.of(Identifier.fromNamespaceAndPath("test", "path"), new PropertyMap(Map.of(Identifier.fromNamespaceAndPath("test", "path"), "value")))));
		cir.setReturnValue(new ModListPayload(Map.of()));
	}
}
