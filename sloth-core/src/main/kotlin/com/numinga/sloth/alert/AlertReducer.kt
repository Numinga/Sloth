package com.numinga.sloth.alert

import com.numinga.sloth.redux.Action
import com.numinga.sloth.redux.Reducer

/**
 * Created by Numinga on 21/02/2018.
 */
class AlertReducer : Reducer<AlertState> {

    override fun reduce(lastState: AlertState, action: Action): AlertState {

        when (action::class.java.simpleName) {
            AlertShowAction::class.java.simpleName -> {
                val alertShowAction = action as AlertShowAction
                return AlertState(error = alertShowAction.error,
                        title = alertShowAction.title,
                        message = alertShowAction.message,
                        buttons = alertShowAction.buttons)
            }
        }

        return lastState
    }
}