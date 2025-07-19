case class Message(
  id: String,
  channelCode: String,  // which channel this belongs to
  userId: String,       // who sent it
  content: String,      // text message
  timestamp: Long       // UNIX timestamp for sorting
// Message case class represents a chat message in a channel.
// Fields:
//   id: Unique identifier for the message.
//   channelCode: Identifier for the channel the message belongs to.
//   userId: Identifier for the user who sent the message.
//   content: The text content of the message.
//   timestamp: UNIX timestamp indicating when the message was sent.
