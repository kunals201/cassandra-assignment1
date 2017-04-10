
class User extends Connection {


  def userByEmail(email: String): Unit = {

    val res = session.execute(s"SELECT * FROM user where email='$email'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
  }

}
