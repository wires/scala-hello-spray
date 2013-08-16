package com.scalapenos.demo

import akka.actor._

import spray.json._
import spray.json.DefaultJsonProtocol._
import spray.routing._

import util._
// import SprayJsonSupport._

// 2 spaces indentation
case class Demo(greeting: String, name: String)

object Demo {
	implicit val jsonFormat = jsonFormat2(Demo.apply)
}

object ApiActor {
	def props = Props[ApiActor]
	// can pass function
}

class ApiActor extends HttpServiceActor with ActorLogging
{
	def receive = runRoute(
		//pathPrefix("foo") {
		path("hello") {
			get {
//				complete(Demo("hello","world!"))
				complete("hello, world!")
				// complete(404)
			} ~
			put {
			/*	entity(as[Demo]) { demo =>
					complete {
						Demo(demo.name, demo.greeting)
					}
				}*/
				complete("foo, bar!")
			}
		}
	)
}

