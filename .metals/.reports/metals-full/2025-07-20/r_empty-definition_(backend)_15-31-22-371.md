file://<WORKSPACE>/backend/src/main/scala/com/secureline/routes/userRoutes.scala
empty definition using pc, found symbol in pc: 
semanticdb not found
empty definition using fallback
non-local guesses:

offset: 183
uri: file://<WORKSPACE>/backend/src/main/scala/com/secureline/routes/userRoutes.scala
text:
```scala
package com.secureline.routes

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
@@import com.secureline.model.
import com.secureline.model.api.{registerUserRequest, registerUserResponse}
import com.secureline.repo.UserRepo

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
          complete(registerUserResponse(userId, req.nickname))
        }
      }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 