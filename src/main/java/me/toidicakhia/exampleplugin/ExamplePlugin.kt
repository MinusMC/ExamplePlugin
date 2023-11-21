package me.toidicakhia.ExamplePlugin

import net.minusmc.minusbounce.plugin.Plugin
import net.minusmc.minusbounce.plugin.PluginAPIVersion

class ExamplePlugin: Plugin("ExamplePlugin", "dev", PluginAPIVersion.VER_01) {
	override fun init() {
		println("This is an example mod!!!")
	}
}