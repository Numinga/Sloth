package com.numinga.sloth.alert

import com.numinga.sloth.redux.Action

/**
 * Created by Numinga on 21/02/2018.
 */
class AlertShowAction(val error: Boolean = false,
                      val title: Int = 0,
                      val message: Int = 0,
                      val buttons: List<Int> = ArrayList()) : Action