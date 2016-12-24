name := "cassandra-kafka-streaming"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.2" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.2" % "provided"

libraryDependencies += ("com.datastax.spark" %% "spark-cassandra-connector" % "2.0.0-M3").exclude("io.netty", "netty-handler")

libraryDependencies += ("com.datastax.cassandra" % "cassandra-driver-core" % "3.0.2").exclude("io.netty", "netty-handler")

libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.0.2" % "provided"

libraryDependencies += ("org.apache.spark" %% "spark-streaming-kafka" % "2.0.2").exclude("org.spark-project.spark", "unused")

