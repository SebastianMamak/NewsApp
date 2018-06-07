package pl.sm.newsapp.base

interface BasePresenter<T> {
    fun setView(view: T)
    fun removeView();
}