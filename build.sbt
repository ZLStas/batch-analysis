name := "batch-analysis"

scalaVersion := "2.12.8"
scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")

libraryDependencies ++= Seq(
  "com.novocode" % "junit-interface" % "0.11" % Test,
  ("org.apache.spark" %% "spark-core" % "2.4.4"),
  ("org.apache.spark" %% "spark-sql" % "2.4.4"),
  ("org.apache.spark" %% "spark-mllib" % "2.4.4")
)
