package pl.sm.newsapp

import android.app.Application
import android.content.Context
import pl.sm.newsapp.di.AppComponent
import pl.sm.newsapp.di.AppModule
import pl.sm.newsapp.di.DaggerAppComponent

class NewsApplication : Application() {

    val appComponent: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    companion object {

        fun getAppComponent(context: Context)
                = (context.applicationContext as NewsApplication).appComponent

    }
}