package preservedbuilding;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

import static preservedbuilding.PreservedBuilding.ModBlocks.AZURITE_GLASS;
import static preservedbuilding.PreservedBuilding.ModBlocks.TINTED_AZURITE_GLASS;

public class PreservedBuildingClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		BlockRenderLayerMap.INSTANCE.putBlock(AZURITE_GLASS, RenderLayer.getTranslucent());
		BlockRenderLayerMap.INSTANCE.putBlock(TINTED_AZURITE_GLASS, RenderLayer.getTranslucent());
	}
}