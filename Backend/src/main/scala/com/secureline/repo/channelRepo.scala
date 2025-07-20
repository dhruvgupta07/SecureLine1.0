package com.secureline.repo

import com.secureline.model.Channel // <-- Add this import
import scala.collection.concurrent.TrieMap

// Remove the local Channel case class definition here

object ChannelRepo {
    // In-memory storage for channels
    private val channels = TrieMap.empty[String, Channel]

    def addChannel(channel: Channel): Unit = {
        channels.put(channel.code, channel) // Use channel.code as the key
    }

    def getChannel(code: String): Option[Channel] = {
        channels.get(code)
    }

    def removeChannel(code: String): Unit = {
        channels.remove(code)
    }

    def listChannels(): Seq[Channel] = {
        channels.values.toSeq
    }
}