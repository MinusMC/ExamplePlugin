package me.toidicakhia.ExamplePlugin

import net.minusmc.minusbounce.plugin.Plugin

class ExamplePlugin: Plugin("ExamplePlugin", "dev") {
	override fun init() {
		println("This is an example mod!!!")
	}
}