//
// DON'T EDIT! This file is GENERATED by `MppJpsIncTestsGenerator` (runs by generateTests)
// from `incremental/multiplatform/multiModule/dependent/dependencies.txt`
//

actual fun ac_platformDependentAc(): String = "apJs"
fun apJs_platformOnly() = "apJs"

fun apJsTest() {
  ac_platformIndependentAc()
  ac_platformDependentAc()
  apJs_platformOnly()
}
