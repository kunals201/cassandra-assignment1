import org.apache.log4j.Logger

object Main extends App {

val log = Logger.getLogger(this.getClass)

val obj=new DatabaseHandling()

val result=obj.createTable

log.info(s"$result \n\n")
obj.insertIntoUsers("kunal@knoldus.in","kunal.sethi",1)

obj.insertIntoVideos(1,"Yaadein",1,2006)
obj.insertIntoVideos(2,"zindagi",1,2012)

obj.insertIntoUsers("kunals201@gmail.in","kunals201",2)

obj.insertIntoVideos(1,"satyam shivam sundaram",2,1992)
obj.insertIntoVideos(2,"aflatooon",1,2002)

obj.insertIntoUsers("himanshi@gmail.in","himanshi",3)

obj.insertIntoVideos(1,"tera hone lga hun",2,2006)
obj.insertIntoVideos(2,"yeh ishq hye",1,2012)


log.info("retrieving user by email")
obj.userByEmail("kunals201@gmail.in")

log.info("finding video by its name")
obj.videoByName("zindagi")

log.info("finding video with user id and year")
obj.videoByUserIdAndYear(1,2012)

log.info("finding video with user id and year")
obj.videoByUserIdAndYearDesc(1,2006)

}

