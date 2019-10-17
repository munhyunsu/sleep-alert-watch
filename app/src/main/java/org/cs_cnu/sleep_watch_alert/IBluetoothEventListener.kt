package org.cs_cnu.sleep_watch_alert

interface IBluetoothEventListener {
    fun onEnable()
    fun onDiscovering()
    fun onDiscovered()
    fun onConnecting()
    fun onConnected(isSuccess: Boolean)
    fun onPairing()
    fun onPaired()
    fun onDisconnecting()
    fun onDisconnected()
}