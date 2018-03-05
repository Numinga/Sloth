package com.numinga.sloth.core

import com.numinga.sloth.alert.AlertReducer
import com.numinga.sloth.redux.Action
import com.numinga.sloth.redux.Reducer

/**
 * Created by Numinga on 21/02/2018.
 */
class AppReducer : Reducer<AppState> {
    private val alertReducer: AlertReducer = AlertReducer()

    override fun reduce(lastState: AppState, action: Action): AppState {
        var hasChanged = false

        val alertState = alertReducer.reduce(lastState.alertState, action)
        hasChanged = hasChanged || alertState != lastState.alertState

        return if (hasChanged) AppState(alertState) else lastState
    }
}