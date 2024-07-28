package com.ahmed_apps.rental_cars_ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * @author Ahmed Guedmioui
 */

@Composable
fun CarList(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues
) {
    LazyColumn(
        modifier = modifier,
        contentPadding = PaddingValues(
            top = paddingValues.calculateTopPadding() + 22.dp,
            bottom = 90.dp
        )
    ) {

        itemsIndexed(luxuriousCars) { index, car ->
            CarItem(
                car = car,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(230.dp),
            )
            Spacer(modifier = Modifier.height(22.dp))
        }

    }
}





















