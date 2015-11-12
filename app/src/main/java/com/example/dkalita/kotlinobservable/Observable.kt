/*
 * @file Observable.kt
 * @author dkalita
 *
 * Copyright (c) 2004-2015. Parallels IP Holdings GmbH. All rights reserved.
 */
package com.example.dkalita.kotlinobservable

import java.util.concurrent.CopyOnWriteArrayList

abstract class Observable<T : Function<Unit>> {

	protected val callbacks: MutableList<T> = CopyOnWriteArrayList()

	operator fun plusAssign(callback: T) {
		check(callback !in callbacks) { "Observer $callback is already registered" }
		callbacks.add(callback)
	}

	operator fun minusAssign(callback: T) {
		check(callback in callbacks) { "Callback $callback was not registered" }
		callbacks.remove(callback)
	}
}

class Observable0() : Observable<Function0<Unit>>() {

	fun notify() = callbacks.forEach { it() }
}
