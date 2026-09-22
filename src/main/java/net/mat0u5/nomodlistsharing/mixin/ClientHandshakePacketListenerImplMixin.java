package net.mat0u5.nomodlistsharing.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import dev.kikugie.fletching_table.annotation.MixinEnvironment;
import net.minecraft.client.multiplayer.ClientHandshakePacketListenerImpl;
import net.minecraft.network.Connection;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.common.ServerboundCustomPayloadPacket;
import net.minecraft.network.protocol.common.custom.ModListPayload;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.Map;

@Mixin(value = ClientHandshakePacketListenerImpl.class, priority = 1)
@MixinEnvironment(type = MixinEnvironment.Env.CLIENT)
public class ClientHandshakePacketListenerImplMixin {
	@WrapOperation(method = "handleLoginFinished", at = @At(value = "INVOKE", target = "Lnet/minecraft/network/Connection;send(Lnet/minecraft/network/protocol/Packet;)V"))
	private void changePacket(Connection instance, Packet<?> packet, Operation<Void> original) {
		if (packet instanceof ServerboundCustomPayloadPacket serverboundCustomPayloadPacket) {
			if (serverboundCustomPayloadPacket.payload() instanceof ModListPayload) {
				original.call(instance, new ServerboundCustomPayloadPacket(new ModListPayload(Map.of())));
				return;
			}
		}
		original.call(instance, packet);
	}
}
