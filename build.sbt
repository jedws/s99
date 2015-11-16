name := "s99"

version := "1.0"

organization := "org.specs2"

scalaVersion := "2.11.7"

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
  "org.specs2"               %% "specs2-core"                % "3.6.5"
, "org.specs2"               %% "specs2-scalacheck"          % "3.6.5"
, "org.scalacheck"           %% "scalacheck"                 % "1.12.5"
, "org.pegdown"               % "pegdown"                    % "1.0.2"
)

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-language:_")

/** Console */
initialCommands in console := "import org.specs2._"

