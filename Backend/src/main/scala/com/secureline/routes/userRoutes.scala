package com.secureline.routes

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import com.secureline.model.User
import com.secureline.model.api.{RegisterUserRequest, RegisterUserResponse}
import com.secureline.repo.UserRepo
import com.secureline.model.api.JsonFormats._ // Ensure this object provides implicit formats

import java.util.UUID

object UserRoutes {
  val routes: Route =
    path("users") {
      post {
        entity(as[RegisterUserRequest]) { req =>
          // Generate unique user ID
          val userId = UUID.randomUUID().toString
          val user = User(userId, req.nickname)
          UserRepo.add(user)
          complete(RegisterUserResponse(userId, req.nickname))
        }
      }
    }
}
