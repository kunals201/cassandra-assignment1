
object Main extends App {

  val user = new User
  val video = new Video
  user.userByEmail("abc@gmail.com")
  video.videoByName("tamma tamma")
  video.videoByUserIdYear(1, 2017)
  video.videoByUserIdYearDesc(1, 2017)

}

