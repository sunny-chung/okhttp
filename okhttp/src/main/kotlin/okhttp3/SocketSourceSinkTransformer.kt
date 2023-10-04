package okhttp3

import okio.Sink
import okio.Source
import java.net.Socket

class SocketSourceSinkTransformer(
  val mapSource: (Socket, Source) -> Source = { _, source -> source },
  val mapSink: (Socket, Sink) -> Sink = { _, sink -> sink },
) {
  companion object {
    val NONE = SocketSourceSinkTransformer()
  }
}
