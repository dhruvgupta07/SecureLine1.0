file://<WORKSPACE>/backend/src/main/scala/com/secureline/routes/userRoutes.scala
empty definition using pc, found symbol in pc: 
semanticdb not found
empty definition using fallback
non-local guesses:
	 -akka/http/scaladsl/server/Directives.req.nickname.
	 -akka/http/scaladsl/server/Directives.req.nickname#
	 -akka/http/scaladsl/server/Directives.req.nickname().
	 -akka/http/scaladsl/marshalling/sprayjson/SprayJsonSupport.req.nickname.
	 -akka/http/scaladsl/marshalling/sprayjson/SprayJsonSupport.req.nickname#
	 -akka/http/scaladsl/marshalling/sprayjson/SprayJsonSupport.req.nickname().
	 -req/nickname.
	 -req/nickname#
	 -req/nickname().
	 -scala/Predef.req.nickname.
	 -scala/Predef.req.nickname#
	 -scala/Predef.req.nickname().
offset: 658
uri: file://<WORKSPACE>/backend/src/main/scala/com/secureline/routes/userRoutes.scala
text:
```scala
package com.secureline.routes

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.marshalling.sprayjson.SprayJsonSupport._
import com.secureline.model.User
import com.secureline.model.api.{RegisterUserRequest, RegisterUserResponse}
import com.secureline.repo.UserRepo

import java.util.UUID

object UserRoutes {
  val routes: Route =
    path("users") {
      post {
        entity(as[RegisterUserRequest]) { req =>
          val userId = UUID.randomUUID().toString
          val user = User(userId, req.nickname)
          UserRepo.add(user)
          complete(RegisterUserResponse(userId, req.nic@@kname))
        }
      }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 