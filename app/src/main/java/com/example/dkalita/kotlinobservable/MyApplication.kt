/*
 * @file MyApplication.kt
 * @author dkalita
 *
 * Copyright (c) 2004-2015. Parallels IP Holdings GmbH. All rights reserved.
 * http://www.parallels.com
 */
package com.example.dkalita.kotlinobservable

import android.app.Application
import com.example.dkalita.kotlinobservable.Observable0

class MyApplication : Application() {

	val observable = Observable0()
}