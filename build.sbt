name := "akka-stocks"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.2"

val akka = "2.3.6"

libraryDependencies ++= Seq(
    ws, // Play's web services module
    "com.typesafe.akka" %% "akka-actor" % akka,
    "com.typesafe.akka" %% "akka-slf4j" % akka,
    "org.webjars" % "bootstrap" % "2.3.1",
    "org.webjars" % "flot" % "0.8.0",
    "com.typesafe.akka" %% "akka-testkit" % akka % "test",
    "com.typesafe.akka" %% "akka-cluster" % akka,
    "com.typesafe.akka" %% "akka-contrib" % akka,
    "com.typesafe.akka" %% "akka-persistence-experimental" % akka exclude("org.iq80.leveldb","leveldb"),
    "org.iq80.leveldb"  %  "leveldb" % "0.7",
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.2"
)

addCommandAlias("rb", "runMain backend.MainClusterManager -Dakka.cluster.roles.0=backend -Dakka.remote.netty.tcp.port=2551")

addCommandAlias("sj", "runMain backend.journal.SharedJournalApp -Dakka.cluster.roles.0=shared-journal -Dakka.remote.netty.tcp.port=2560")