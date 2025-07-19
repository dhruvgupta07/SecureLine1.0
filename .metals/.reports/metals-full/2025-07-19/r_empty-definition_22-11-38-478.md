error id: file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/messageRepo.scala:`<none>`.
file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/messageRepo.scala
empty definition using pc, found symbol in pc: `<none>`.
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -updated.
	 -updated#
	 -updated().
	 -scala/Predef.updated.
	 -scala/Predef.updated#
	 -scala/Predef.updated().
offset: 431
uri: file://<WORKSPACE>/backend/src/main/scala/com/secureline/repo/messageRepo.scala
text:
```scala
package com.secureline.repo

import scala.collection.concurrent.TrieMap

import com.secureline.model.message

object MessageRepo {
  // Key: Channel code; Value: List of Messages in that Channel
  val messages: mutable.Map[String, List[Message]] = mutable.Map.empty

  def add(channelCode: String, message: Message): Unit = {
    val updated = messages.getOrElse(channelCode, List()) :+ message
    messages.update(channelCode, upd@@ated)
  }
  def get(channelCode: String): List[Message] = messages.getOrElse(channelCode, List())
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: `<none>`.