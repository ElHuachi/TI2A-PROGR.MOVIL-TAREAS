package net.juanaghuachi.cuadricula.model

import androidx.annotation.StringRes
import androidx.annotation.DrawableRes


    data class Topic(
        @StringRes val name: Int,
        val availableCourses: Int,
        @DrawableRes val imageRes: Int
    )
