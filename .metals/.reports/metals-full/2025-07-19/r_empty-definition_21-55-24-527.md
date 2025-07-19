error id: file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/channelRepo.scala:`<none>`.
file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/channelRepo.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 189
uri: file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/channelRepo.scala
text:
```scala
package com.secureline.repo

import scala.collection.concurrent.TrieMap

case class Channel(id: String, name: String, members: Set[String])

object ChannelRepo {
    // In-memory storage fo@@r channels
    private val channels = TrieMap.empty[String, Channel]
    // In-line storage for channels (for quick access or caching)
    private val inlineChannels = scala.collection.mutable.Set.empty[Channel]

    def addChannel(channel: Channel): Unit = {
        channels.put(channel.id, channel)
        inlineChannels += channel
    }

    def getChannel(id: String): Option[Channel] = {
        channels.get(id)
    }

    // Get all channels from in-line storage
    def getInlineChannels(): Seq[Channel] = {
        inlineChannels.toSeq
    }

    def removeChannel(id: String): Unit = {
        channels.get(id).foreach(inlineChannels -= _)
        channels.remove(id)
    }

    def listChannels(): Seq[Channel] = {
        channels.values.toSeq
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.