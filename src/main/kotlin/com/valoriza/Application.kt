package com.valoriza

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.valoriza")
		.start()
}

