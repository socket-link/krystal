package link.socket.krystal

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Krystal Demo",
    ) {
        MaterialTheme {
            val scrollState = rememberScrollState()
            
            KrystalContainer(
                scrollState = scrollState,
                foregroundContent = {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                    ) {
                        AppForegroundContent()
                        Spacer(modifier = Modifier.weight(1f))
                        KrystalDebugToggle()
                    }
                },
                backgroundContent = {
                    AppBackgroundContent(scrollState)
                },
            )
        }
    }
}
