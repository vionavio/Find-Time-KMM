package com.viona.findtime.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.res.stringResource
import com.viona.findtime.android.ui.MainView
import io.github.aakira.napier.DebugAntilog
import io.github.aakira.napier.Napier




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            // 1
            Napier.base(DebugAntilog())
            setContent {
                // 2
                MainView {
                    // 3
                    TopAppBar(title = {
                        // 4
                        when (it) {
                            0 -> Text(text = stringResource(R.string.world_clocks))
                            else -> Text(text = stringResource(R.string.findmeeting))
                        }
                    })
                }
            }

        }


    }


}
