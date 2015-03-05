name := "s99"

version := "1.0"

organization := "org.specs2"

scalaVersion := "2.11.5"

/** Dependencies */
resolvers ++= Seq(
  "mvn-local"          at "file://" + Path.userHome.absolutePath + "/.m2/repository"
, "atlassian-public"   at "https://maven.atlassian.com/content/groups/atlassian-public/"
, "atlassian-internal" at "https://maven.atlassian.com/content/groups/internal/"
, "Tools Releases"     at "http://oss.sonatype.org/content/repositories/releases"
, "Tools Snapshots"    at "http://oss.sonatype.org/content/repositories/snapshots"
, "Scalaz Bintray"     at "http://dl.bintray.com/scalaz/releases"
)

libraryDependencies ++= Seq(
  "org.specs2"               %% "specs2"                     % "2.4.9"
, "org.scalacheck"           %% "scalacheck"                 % "1.11.6"
, "org.pegdown"               % "pegdown"                    % "1.0.2"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")

/** Console */
initialCommands in console := "import org.specs2._"

