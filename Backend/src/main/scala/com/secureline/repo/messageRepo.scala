package com.secureline.repo

import scala.collection.mutable
import com.secureline.model.Message // <-- Correct import

object MessageRepo {
  // Key: Channel code; Value: List of Messages in that Channel
  val messages: mutable.Map[String, List[Message]] = mutable.Map.empty

  def add(channelCode: String, message: Message): Unit = {
    val updated = messages.getOrElse(channelCode, List()) :+ message
    messages.update(channelCode, updated)
  }
  def get(channelCode: String): List[Message] = messages.getOrElse(channelCode, List())
}