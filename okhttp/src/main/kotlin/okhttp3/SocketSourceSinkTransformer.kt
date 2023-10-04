package okhttp3

import okio.Sink
import okio.Source

class SocketSourceSinkTransformer(
  val mapSource: (Source) -> Source = { it },
  val mapSink: (Sink) -> Sink = { it },
) {
  companion object {
    val NONE = SocketSourceSinkTransformer()
  }
}
