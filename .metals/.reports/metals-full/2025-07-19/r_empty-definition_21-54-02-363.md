error id: file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/channelRepo.scala:scala/Predef.String#
file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/channelRepo.scala
empty definition using pc, found symbol in pc: scala/Predef.String#
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -String#
	 -scala/Predef.String#
offset: 101
uri: file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/channelRepo.scala
text:
```scala
package com.secureline.repo

import scala.collection.concurrent.TrieMap

case class Channel(id: Strin@@g, name: String, members: Set[String])

object ChannelRepo {
    // In-memory storage for channels
    private val channels = TrieMap.empty[String, Channel]

    def addChannel(channel: Channel): Unit = {
        channels.put(channel.id, channel)
    }

    def getChannel(id: String): Option[Channel] = {
        channels.get(id)
    }

    def removeChannel(id: String): Unit = {
        channels.remove(id)
    }

    def listChannels(): Seq[Channel] = {
        channels.values.toSeq
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/Predef.String#