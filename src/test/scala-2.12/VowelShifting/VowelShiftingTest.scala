package VowelShifting

import org.scalatest.{FlatSpec, FunSuite}
import org.scalatest.Matchers._
import org.scalatest.BeforeAndAfter

/**
  * Created by Nenyi on 16/02/2017.
  */
class VowelShiftingTest extends FlatSpec with BeforeAndAfter {

  var v: VowelShifting = _
  before {
    v = new VowelShifting
  }
  "vowelShift" should
    "Handle 3 Basic Tests" in {
    v vowelShift("This is a test!", 0) shouldBe "This is a test!"
    v vowelShift("This is a test!", 1) shouldBe "Thes is i tast!"
    v vowelShift("This is a test!", 3) shouldBe "This as e tist!"
  }
  it should "Handle Random Tests" in {

    v vowelShift(null, 1) shouldBe Nil
    v vowelShift("", 1) shouldBe ""
    v vowelShift("This is a test!", 1) shouldBe "Thes is i tast!"
    v vowelShift("This is a test!", 3) shouldBe "This as e tist!"
    v vowelShift("This is a test!", 4) shouldBe "This is a test!"
    v vowelShift("This is a test!", -1) shouldBe "This as e tist!"
    v vowelShift("This is a test!", -5) shouldBe "This as e tist!"
    v vowelShift("TDkdjCgTbJxPhpAfocnWsnl.", -7) shouldBe "TDkdjCgTbJxPhpofAcnWsnl."
    v vowelShift("KJxUaFJOmAszjzKyhZsro!", -17) shouldBe "KJxOAFJomUszjzKyhZsra!"
    v vowelShift("YgtDYCj ZlvxTMEgkdoms.", -50) shouldBe "YgtDYCj ZlvxTMEgkdoms."
    v vowelShift("ogMlIzgGhsOny XnQGaOkTXVqLz.", -13) shouldBe "agMlOzgGhsony XnQGIOkTXVqLz."
    v vowelShift("glfoWcUtWSzcmpinrZxoEHz dRI!", -34) shouldBe "glfEWcItWSzcmponrZxUiHz dRo!"
    v vowelShift("aZL AIeNEyEEPfxOQDff neXJmp!", 1) shouldBe "eZL aAINeyEEPfxEQDff nOXJmp!"
    v vowelShift("AeW JKYLIXnVjKgxSdNkbRgUNG.", 27) shouldBe "eIW JKYLUXnVjKgxSdNkbRgANG."
    v vowelShift("BifnIPNSVpZtYybyvdVsgtYBHLMt!", 19) shouldBe "BIfniPNSVpZtYybyvdVsgtYBHLMt!"
    v vowelShift("NZGEa J zdShNIuU DaMgNKdkJQA.", 24) shouldBe "NZGUa J zdShNAEa DIMgNKdkJQu."
  }
}
