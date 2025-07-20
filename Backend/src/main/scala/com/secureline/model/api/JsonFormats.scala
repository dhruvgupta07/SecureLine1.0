package com.secureline.model.api
import spray.json.DefaultJsonProtocol._
import com.secureline.model.api.{RegisterUserRequest, RegisterUserResponse}

object JsonFormats {
  implicit val registerUserRequestFormat = jsonFormat1(RegisterUserRequest)
  implicit val registerUserResponseFormat = jsonFormat2(RegisterUserResponse)
}