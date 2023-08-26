package me.toidicakhia.examplemod

import net.ccbluex.liquidbounce.plugin.Plugin

class ExampleMod: Plugin("ExampleMod", "dev") {
	override fun init() {
		println("This is an example mod!!!")
	}
}