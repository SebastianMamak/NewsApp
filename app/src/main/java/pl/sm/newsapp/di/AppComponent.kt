package pl.sm.newsapp.di

import dagger.Component

@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
}