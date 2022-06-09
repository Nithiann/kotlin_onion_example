package com.nithiann.usercomposepage.presentation.userpage.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.nithiann.usercomposepage.domain.model.User

@Composable
fun UserCard(user: User) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primaryContainer),
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        AsyncImage(model = user.avatar, contentDescription = null, modifier = Modifier.padding(20.dp).border(
            border = BorderStroke(2.dp, Color.Black),
            shape = RoundedCornerShape(60.dp)
        ))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(
                text = "${user.first_name} ",
                style = MaterialTheme.typography.headlineMedium
            )
            Text(
                text = "${user.last_name}",
                style = MaterialTheme.typography.headlineMedium
            )
        }
    }
}