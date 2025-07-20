file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/channelRepo.scala
empty definition using pc, found symbol in pc: 
semanticdb not found
empty definition using fallback
non-local guesses:
	 -channels.
	 -scala/Predef.channels.
offset: 340
uri: file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/channelRepo.scala
text:
```scala
package com.secureline.repo

import scala.collection.concurrent.TrieMap

// Update the import path to the correct location of Channel, for example:
import com.secureline.model.


object ChannelRepo {
  // Key: Channel code; Value: Channel
  val channels: TrieMap[String, Channel] = TrieMap.empty

  def add(channel: Channel): Unit = channel@@s.put(channel.code, channel)
  def get(code: String): Option[Channel] = channels.get(code)
  def update(channel: Channel): Unit = channels.put(channel.code, channel)
  def all(): Seq[Channel] = channels.values.toSeq
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 