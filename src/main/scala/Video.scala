
class Video extends Connection {
  def videoByName(name: String): Unit = {

    val res = session.execute(s"SELECT * FROM videoByName where video_name='$name'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
  }

  def videoByUserIdYear(id: Int, year: Int): Unit = {

    val res = session.execute(s"SELECT * FROM videoByUserIdnYear where userId=$id AND year>$year")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
  }

  def videoByUserIdYearDesc(id: Int, year: Int): Unit = {

    val res = session.execute(s"SELECT * FROM videoByUserIdnYear where userId=$id AND year>$year ORDER BY year DESC")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
  }
}
