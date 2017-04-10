import org.apache.log4j.Logger

class DatabaseHandling extends Connection {
  val log = Logger.getLogger(this.getClass)

  def createTable: String = {

    session.execute("CREATE TABLE users (email text, password text,id int, PRIMARY KEY (email,id))")

    session.execute("CREATE TABLE videos (video_id int,video_name text,id int, year int, PRIMARY KEY ((video_name),year))")

    session.execute("CREATE TABLE videoByUserIdAndYear (video_id int,video_name text, user_id int, year int, PRIMARY KEY (user_id,year))")

    "Tables Created successfully"
  }

  def insertIntoUsers(email: String, password: String, id: Int) = {

    session.execute(s"INSERT INTO users (email , id , password ) VALUES ( '$email',$id,'$password');")

  }

  def insertIntoVideos(videoId: Int, videoName: String, id: Int, year: Int) = {

    session.execute(s"INSERT INTO videos (video_id , video_name ,userId , year ) VALUES ($videoId,'$videoName',$id,$year )")

    session.execute(s"INSERT INTO videoByUserIdAndYear (video_id , video_name , id , year ) VALUES ($videoId,'$videoName',$id,$year )")

  }
  def userByEmail(email: String): Unit = {

    val res = session.execute(s"SELECT * FROM users where email='$email'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      log.info(iterate.next())

    }
  }

  def videoByName(name: String): Unit = {

    val res = session.execute(s"SELECT * FROM videoByName where video_name='$name'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      log.info(iterate.next())

    }
  }

  def videoByUserIdAndYear(id: Int, year: Int): Unit = {

    val res = session.execute(s"SELECT * FROM videoByUserIdnYear where id=$id AND year>$year")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      log.info(iterate.next())

    }
  }
  def videoByUserIdAndYearDesc(id: Int, year: Int): Unit = {

    val res = session.execute(s"SELECT * FROM videoByUserIdnYear where id=$id AND year>$year ORDER BY year DESC")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      log.info(iterate.next())

    }
  }
}
