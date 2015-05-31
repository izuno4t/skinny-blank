// ------------------------------
// Automated code formatter before compilaion
// Disabled by default because this is confusing for beginners
//scalariformSettings

// ------------------------------
// for ./skinnny console
initialCommands := """
import skinny._
import _root_.controller._, model._
import org.joda.time._
import scalikejdbc._, config._
skinny.DBSettings.initialize()
implicit val session = AutoSession
DBSettings.initialize()
"""

libraryDependencies ++= Seq(
	"joda-time" % "joda-time" % "2.3",
	"org.joda" % "joda-convert" % "1.6",
	"org.postgresql" % "postgresql" % "9.4-1201-jdbc41"
)
