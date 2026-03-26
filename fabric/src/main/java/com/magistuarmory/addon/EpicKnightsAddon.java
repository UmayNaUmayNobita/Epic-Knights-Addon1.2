package com.magistuarmory.addon;

import com.magistuarmory.addon.config.AddonConfig;
import com.magistuarmory.addon.config.WeaponsConfig;
import com.magistuarmory.addon.item.AddonItems;
import com.magistuarmory.addon.misc.AddonCreativeTabs;
import com.magistuarmory.addon.misc.AddonMerchOffers;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigHolder;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;

public class EpicKnightsAddon
{
	public static final String ID = "magistuarmoryaddon";
	public static AddonConfig CONFIG;
	
	static
	{
		AutoConfig.register(AddonConfig.class, PartitioningSerializer.wrap(JanksonConfigSerializer::new));
		CONFIG = AutoConfig.getConfigHolder(AddonConfig.class).getConfig();
	}
    
    public static void init()
    {
		System.out.println("Hello from Epic Knights Addon init!");
	    AddonItems.INSTANCE.init();
	    AddonCreativeTabs.init();
	    AddonMerchOffers.init();
    }
}
