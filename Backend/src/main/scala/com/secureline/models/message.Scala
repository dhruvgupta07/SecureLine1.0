case class Message(
  id: String,
  channelCode: String,  // which channel this belongs to
  userId: String,       // who sent it
  content: String,      // text message
  timestamp: Long       // UNIX timestamp for sorting
)
