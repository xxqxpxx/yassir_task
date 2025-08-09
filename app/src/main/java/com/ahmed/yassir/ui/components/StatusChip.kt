package com.ahmed.yassir.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahmed.yassir.ui.theme.StatusGreen
import com.ahmed.yassir.ui.theme.StatusGrey
import com.ahmed.yassir.ui.theme.StatusRed

@Composable
fun StatusChip(
    status: String,
    modifier: Modifier = Modifier
) {
    val (backgroundColor, textColor, statusColor) = when (status.lowercase()) {
        "alive" -> Triple(StatusGreen.copy(alpha = 0.1f), StatusGreen, StatusGreen)
        "dead" -> Triple(StatusRed.copy(alpha = 0.1f), StatusRed, StatusRed)
        else -> Triple(StatusGrey.copy(alpha = 0.1f), StatusGrey, StatusGrey)
    }

    Row(
        modifier = modifier
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(12.dp)
            )
            .padding(horizontal = 8.dp, vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Box(
            modifier = Modifier
                .size(8.dp)
                .background(statusColor, CircleShape)
        )
        Text(
            text = status,
            color = textColor,
            fontSize = 12.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun SpeciesChip(
    species: String,
    modifier: Modifier = Modifier
) {
    val (backgroundColor, textColor) = when (species.lowercase()) {
        "human" -> MaterialTheme.colorScheme.primary.copy(alpha = 0.1f) to MaterialTheme.colorScheme.primary
        "alien" -> MaterialTheme.colorScheme.secondary.copy(alpha = 0.1f) to MaterialTheme.colorScheme.secondary
        else -> MaterialTheme.colorScheme.outline.copy(alpha = 0.1f) to MaterialTheme.colorScheme.outline
    }

    Box(
        modifier = modifier
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text = species,
            color = textColor,
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun GenderChip(
    gender: String,
    modifier: Modifier = Modifier
) {
    val (backgroundColor, textColor) = when (gender.lowercase()) {
        "male" -> MaterialTheme.colorScheme.tertiary.copy(alpha = 0.1f) to MaterialTheme.colorScheme.tertiary
        "female" -> MaterialTheme.colorScheme.secondary.copy(alpha = 0.1f) to MaterialTheme.colorScheme.secondary
        "genderless" -> MaterialTheme.colorScheme.outline.copy(alpha = 0.1f) to MaterialTheme.colorScheme.outline
        else -> MaterialTheme.colorScheme.surfaceVariant to MaterialTheme.colorScheme.onSurfaceVariant
    }

    Box(
        modifier = modifier
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(8.dp)
            )
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text = gender,
            color = textColor,
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun TypeChip(
    type: String,
    modifier: Modifier = Modifier
) {
    if (type.isNotEmpty()) {
        Box(
            modifier = modifier
                .background(
                    color = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
                    shape = RoundedCornerShape(8.dp)
                )
                .padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
            Text(
                text = type,
                color = MaterialTheme.colorScheme.primary,
                fontSize = 11.sp,
                fontWeight = FontWeight.Medium
            )
        }
    }
}

@Composable
fun PropertyRow(
    label: String,
    value: String,
    valueColor: Color = MaterialTheme.colorScheme.onSurface,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium,
            color = valueColor
        )
    }
}
