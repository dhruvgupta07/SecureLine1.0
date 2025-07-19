case class Channel(
  code: String,         // unique channel code for joining
  name: String,         // channel/group name
  members: Set[User]    // users in the channel
)
