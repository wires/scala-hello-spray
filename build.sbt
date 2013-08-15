import com.typesafe.sbt.SbtStartScript

seq(SbtStartScript.startScriptForClassesSettings: _*)

seq(Revolver.settings: _*)


name := "demo"

organization := "com.scalapenos"

version := "0.1-SNAPSHOT"

scalaVersion := "2.10.2"

scalacOptions := Seq("-encoding", "utf8",
                     "-target:jvm-1.6",
                     "-feature",
                     "-language:implicitConversions",
                     "-language:postfixOps",
                     "-unchecked",
                     "-deprecation",
                     "-Xlog-reflective-calls",
                     "-Ywarn-adapted-args"
                    )

resolvers ++= Seq("Sonatype Releases"   at "http://oss.sonatype.org/content/repositories/releases",
                  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
                  "Spray Repository"    at "http://repo.spray.io/",
                  "Spray Nightlies"     at "http://nightlies.spray.io/")

libraryDependencies ++= {
  val akkaVersion  = "2.2.0"
  val sprayVersion = "1.2-20130727"
  Seq(
    "com.typesafe.akka"       %%  "akka-actor"             % akkaVersion,
    "com.typesafe.akka"       %%  "akka-slf4j"             % akkaVersion,
    "io.spray"                %   "spray-can"              % sprayVersion,
    "io.spray"                %   "spray-routing"          % sprayVersion,
    "io.spray"                %   "spray-client"           % sprayVersion,
    "io.spray"                %%  "spray-json"             % "1.2.5",
    "com.github.nscala-time"  %%  "nscala-time"            % "0.4.2",
    "ch.qos.logback"          %   "logback-classic"        % "1.0.12",
    "com.typesafe.akka"       %%  "akka-testkit"           % akkaVersion    % "test",
    "io.spray"                %   "spray-testkit"          % sprayVersion   % "test",
    "org.specs2"              %%  "specs2"                 % "2.1.1"        % "test"
  )
}
