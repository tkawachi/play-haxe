import bintray.Keys._

publishMavenStyle := false

seq(bintraySettings:_*)

repository in bintray := "personal"

bintrayOrganization in bintray := None
