
I used the following versions to do this stuff

	» sbt --version
	sbt launcher version 0.12.4

	» scalac -version
	Scala compiler version 2.10.2 -- Copyright 2002-2013, LAMP/EPFL

We wanted to setup a server that uses spray to do RESTful API's. So, we
started out with Age's template `build.sbt`, then extended this to a
minimal "hello world" with GET and PUT handlers.

Step one:

	» sbt
	> compile

or simply

	» sbt run

Then,

	» curl localhost:5000/hello
	hello, world!%

	» curl-XPUT localhost:5000/hello
	foo, bar!%


Later we extended it with JSON (un)marshalling from(to) a case class.
For this we used another bit of Age's code, to directly pass a
`Marshallable` JSON object to the `complete` directive of spray.

Step two:

	curl ... {"hello": "world"}

Some more info on directives in spray:
http://spray.io/documentation/1.2-M8/spray-routing/cookie-directives/

Talk by Age with some information on Scala `implicit`s:
https://speakerdeck.com/agemooij/from-a-to-l-designing-scala-libraries

HTTP tool, "better" curl `https://github.com/jkbr/httpie`

Mentioned:
- sbt revolver (restarts JVM)
- sbt startscript (for heroku)
- spray-testkit, akka-testkit
- shapeless library
