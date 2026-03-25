package com.magistuarmory.addon.fabric;

import com.magistuarmory.addon.EpicKnightsAddon;
import com.magistuarmory.addon.client.render.model.AddonModels;
import com.magistuarmory.addon.item.AddonItems;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;

public class EpicKnightsAddonFabric implements ModInitializer
{
    @Override
    public void onInitialize()
    {
        EpicKnightsAddon.init();
    }

    public static class Client implements ClientModInitializer
    {
        @Override
        public void onInitializeClient()
        {
            AddonModels.INSTANCE.init(AddonItems.INSTANCE);
        }
    }
}
