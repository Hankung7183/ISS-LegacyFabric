package me.hankung.iss;

import net.fabricmc.api.ModInitializer;

public class ISS implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("[IngameServerSwitcher] Initalized");
	}
}
