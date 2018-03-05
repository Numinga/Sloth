package com.numinga.sloth.alert

/**
 * Created by io185011 on 21/02/2018.
 */
data class AlertState(val error: Boolean = false,
                      val title: Int = 0,
                      val message: Int = 0,
                      val buttons: List<Int> = ArrayList())