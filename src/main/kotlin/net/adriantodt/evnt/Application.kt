package net.adriantodt.evnt

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("net.adriantodt.evnt")
		.start()
}

