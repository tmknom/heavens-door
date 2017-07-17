import org.scalatestplus.play.PlaySpec
import org.scalatestplus.play.guice.GuiceOneAppPerSuite
import play.api.http.Status
import play.api.test.FakeRequest
import play.api.test.Helpers._

/**
 * Functional tests start a Play application internally, available
 * as `app`.
 */
class FunctionalSpec extends PlaySpec with GuiceOneAppPerSuite {

  "Routes" should {

    "send 404 on a bad request" in  {
      route(app, FakeRequest(GET, "/boum")).map(status) mustBe Some(NOT_FOUND)
    }

    "send 200 on a good request" in  {
      route(app, FakeRequest(GET, "/health_check")).map(status) mustBe Some(OK)
    }

  }

  "HealthCheckController" should {

    "render the json" in {
      val expected = "{\"status\":\"ok\"}"
      val home = route(app, FakeRequest(GET, "/health_check")).get

      status(home) mustBe Status.OK
      contentType(home) mustBe Some("application/json")
      contentAsString(home) must equal(expected)
    }

  }
}
