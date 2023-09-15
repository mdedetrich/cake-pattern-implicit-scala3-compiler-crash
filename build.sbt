name := "cake-pattern-implicit-scala3-compiler-crash"

val scala213 = "2.13.8"
val scala3 = "3.3.1"

scalaVersion := scala213
crossScalaVersions := Seq(scala213,scala3)

scalacOptions ++= {
  if (scalaBinaryVersion.value.startsWith("3"))
    Seq("-language:implicitConversions")
  else Seq.empty
}