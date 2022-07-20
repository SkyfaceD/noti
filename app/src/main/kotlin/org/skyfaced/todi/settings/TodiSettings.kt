package org.skyfaced.todi.settings

interface TodiSettings {
    val theme: Settings<TodiTheme>
    val dynamicColor: Settings<Boolean>
    val amoled: Settings<Boolean>
    val locale: Settings<TodiLocale>
}