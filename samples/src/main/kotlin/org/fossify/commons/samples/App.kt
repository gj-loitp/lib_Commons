package org.fossify.commons.samples

import android.app.Application
import com.github.ajalt.reprint.core.Reprint
import org.fossify.commons.FossifyApp
class App : FossifyApp() {
    override fun onCreate() {
        super.onCreate()
        Reprint.initialize(this)
    }
}

//class App : Application() {
//    override fun onCreate() {
//        super.onCreate()
//        Reprint.initialize(this)
//    }
//}
