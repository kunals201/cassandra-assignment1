import com.datastax.driver.core.Cluster


trait Connection {
  val cluster = Cluster.builder().addContactPoint("127.0.0.1").build()

  val session = cluster.connect("kip")
}
