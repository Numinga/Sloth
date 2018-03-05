package com.numinga.sloth.redux

/**
 * Created by Numinga on 21/02/2018.
 */
interface Dispatcher {
    fun dispatch(action: Action)
}