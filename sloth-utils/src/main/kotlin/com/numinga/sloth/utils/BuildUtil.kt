package com.numinga.sloth.utils

import android.content.Context
import android.content.pm.PackageManager

/**
 * Created by io185011 on 20/02/2018.
 */
open class BuildUtil {

    companion object {

        @Throws(PackageManager.NameNotFoundException::class)
        fun getVersionName(context: Context): String {
            return context.packageManager.getPackageInfo(context.packageName, 0).versionName
        }

        @Throws(PackageManager.NameNotFoundException::class)
        fun getVersionCode(context: Context): Int {
            return context.packageManager.getPackageInfo(context.packageName, 0).versionCode
        }

        fun getApplicationName(context: Context): String {
            return context.getString(context.applicationInfo.labelRes)
        }
    }
}