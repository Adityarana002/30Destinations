package com.aditya.a30dd

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.AppTheme

@Composable
fun DestinationCard(
    num: Int,
    @DrawableRes imageId: Int,
    @StringRes d_name: Int,
    @StringRes d_place: Int,
    @StringRes d_Description: Int,
    modifier: Modifier = Modifier
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface,
            contentColor = MaterialTheme.colorScheme.onSurface
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = modifier
            .fillMaxWidth()
            .clip(MaterialTheme.shapes.large)
            .padding(vertical = 8.dp)
            .clickable { expanded = !expanded }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessLow
                    )
                )
        ) {
            NonExpandedCard(num, d_name, d_place, imageId)

            if (expanded) {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(id = d_Description),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface,
                    modifier = Modifier.align(Alignment.Start)
                )
            }
        }
    }
}

@Composable
private fun NonExpandedCard(
    num: Int,
    @StringRes d_name: Int,
    @StringRes d_place: Int,
    @DrawableRes imageId: Int,
    modifier: Modifier = Modifier
) {
    Text(
        text = num.toString(),
        style = MaterialTheme.typography.titleSmall,
        color = MaterialTheme.colorScheme.primary,
    )

    Spacer(modifier = Modifier.height(4.dp))

    Text(
        text = stringResource(id = d_name),
        style = MaterialTheme.typography.titleLarge,
        color = MaterialTheme.colorScheme.onSurface,
    )

    Spacer(modifier = Modifier.height(4.dp))

    Text(
        text = stringResource(id = d_place),
        style = MaterialTheme.typography.bodyMedium,
        color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f),
    )

    Spacer(modifier = Modifier.height(16.dp))

    Image(
        painter = painterResource(id = imageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(MaterialTheme.shapes.medium)
    )
}

@Preview
@Composable
fun DestinationScreenLightPreview() {
    AppTheme(darkTheme = false) {
        DestinationCard(
            num = 1,
            R.drawable.nubra,
            R.string.destination_1,
            R.string.d_place_1,
            R.string.d_description_1
        )
    }
}

@Preview
@Composable
fun DestinationScreenDarkPreview() {
    AppTheme(darkTheme = true) {
        DestinationCard(
            num = 1,
            R.drawable.nubra,
            R.string.destination_1,
            R.string.d_place_1,
            R.string.d_description_1
        )
    }
}
