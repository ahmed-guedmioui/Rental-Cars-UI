package com.ahmed_apps.rental_cars_ui

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.ahmed_apps.rental_cars_ui.ui.theme.Primary
import com.ahmed_apps.rental_cars_ui.ui.theme.Secondary

/**
 * @author Ahmed Guedmioui
 */
data class Car(
    val name: String,
    @DrawableRes val image: Int,
    val color: Color,
    @DrawableRes val logo: Int,
    val recommendation: Int,
    val recommendationRate: Float,
    val rentalDays: Int,
    val price: Int,
    val recommenders: List<Int>,
    val bgColor: Color
)


val luxuriousCars = listOf(
    Car(
        name = "Ferrari SF90 Stradale",
        image = R.drawable.ferrari_car,
        color = Color.Red,
        logo = R.drawable.ferrari_logo,
        recommendation = 97,
        recommendationRate = 4.8f,
        rentalDays = 7,
        price = 759,
        recommenders = listOf(
            R.drawable.m_2, R.drawable.w_1, R.drawable.w_2
        ),
        bgColor = Primary
    ),
    Car(
        name = "Rolls-Royce Phantom",
        image = R.drawable.rolls_royce_car,
        color = Color.Black,
        logo = R.drawable.rolls_royce_logo,
        recommendation = 98,
        recommendationRate = 4.7f,
        rentalDays = 10,
        price = 799,
        recommenders = listOf(
            R.drawable.m_1, R.drawable.w_2, R.drawable.m_3
        ),
        bgColor = Secondary
    ),
    Car(
        name = "Porsche 911 Turbo S",
        image = R.drawable.porsche_car,
        color = Color.Yellow,
        logo = R.drawable.porsche_logo,
        recommendation = 99,
        recommendationRate = 4.8f,
        rentalDays = 6,
        price = 689,
        recommenders = listOf(
            R.drawable.m_3, R.drawable.w_1, R.drawable.m_1
        ),
        bgColor = Primary
    ),
    Car(
        name = "Lamborghini Aventador",
        image = R.drawable.lamborghini_car,
        color = Color.White,
        logo = R.drawable.lamborghini_logo,
        recommendation = 97,
        recommendationRate = 4.9f,
        rentalDays = 5,
        price = 649,
        recommenders = listOf(
            R.drawable.w_1, R.drawable.w_2, R.drawable.m_2
        ),
        bgColor = Secondary
    )
)
