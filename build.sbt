/** Project */
name := "s99"

version := "1.0"

organization := "org.specs2"

scalaVersion := "2.10.2"

/** Dependencies */
resolvers ++= Seq("snapshots-repo" at "http://oss.sonatype.org/content/repositories/snapshots")

libraryDependencies ++= Seq(
  "org.specs2"               %% "specs2"                     % "2.2"
, "org.scalacheck"           %% "scalacheck"                 % "1.10.1"
, "org.pegdown"               % "pegdown"                    % "1.0.2"
)

scalacOptions ++= Seq("-deprecation", "-unchecked")

/** Console */
initialCommands in console := "import org.specs2._"

