package net.mat0u5.nomodlistsharing.mixin;

import dev.kikugie.fletching_table.annotation.MixinEnvironment;
import net.mat0u5.nomodlistsharing.Main;
import net.minecraft.network.protocol.common.ServerboundCustomPayloadPacket;
import net.minecraft.network.protocol.common.custom.ModListPayload;
import net.minecraft.server.network.ServerCommonPacketListenerImpl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ServerCommonPacketListenerImpl.class, priority = 1)
@MixinEnvironment(type = MixinEnvironment.Env.MAIN)
public class ServerCommonPacketListenerImplMixin {
	/*
	@Inject(method = "handleCustomPayload", at = @At("HEAD"))
	private void testPackets(ServerboundCustomPayloadPacket packet, CallbackInfo ci) {
		if (packet.payload() instanceof ModListPayload modListPayload) {
			int count = modListPayload.entries().size();
			if (count <= 0) {
				Main.LOGGER.info("Received ModListPayload with zero entries.");
			}
			else {
				Main.LOGGER.error("Received ModListPayload with {} entries: {}", count, modListPayload.entries());
			}
		}
	}
	*/
}
