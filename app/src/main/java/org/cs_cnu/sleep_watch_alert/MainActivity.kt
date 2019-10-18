package org.cs_cnu.sleep_watch_alert

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val bluetoothConnectionService : BluetoothConnectionService = BluetoothConnectionService(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
