package api

import api.cart.cart_id
import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object cart_total {

 def cartTotal(): ChainBuilder =
   exec(
     http("Cart_total")
       .get(s"/api/v1/cart/${cart_id}/total/")
)
}
