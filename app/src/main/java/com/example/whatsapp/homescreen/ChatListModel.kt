package com.example.whatsapp.homescreen

import android.media.Image
import android.os.Message

data class ChatListModel (
    val image: Int,
    val name: String,
    val time: String,
    val message: String
)