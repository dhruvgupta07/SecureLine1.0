package com.secureline.repo

import scala.collection.concurrent.TrieMap

import com.secureline.model.User

object UserRepo {
  // Key: User ID; Value: User
  val users: TrieMap[String, User] = TrieMap.empty

  def add(user: User): Unit = users.put(user.id, user)
  def get(id: String): Option[User] = users.get(id)
  def all(): Seq[User] = users.values.toSeq
}