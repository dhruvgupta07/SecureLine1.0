package com.secureline.repo

import scala.collection.concurrent.TrieMap

import com.secureline.model.Channel


object ChannelRepo {
  // Key: Channel code; Value: Channel
  val channels: TrieMap[String, Channel] = TrieMap.empty

  def add(channel: Channel): Unit = channels.put(channel.code, channel)
  def get(code: String): Option[Channel] = channels.get(code)
  def update(channel: Channel): Unit = channels.put(channel.code, channel)
  def all(): Seq[Channel] = channels.values.toSeq
}