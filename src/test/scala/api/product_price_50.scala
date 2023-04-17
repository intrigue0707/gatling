package api

import helpers.BaseHelpers._
import io.gatling.core.Predef._
import io.gatling.core.structure._
import io.gatling.http.Predef._

object product_price_50 {
  def productPrice50(): ChainBuilder = {
    exec(
      http("Product_50_price")
        .post("/api/v1/product/50/price/")
        .header("Content-Type", "application/json")
        .body(StringBody(body_options)).asJson)
  }
}
