
class Media(val value: String) 

object Media {
	def apply(value: String) = new Media(value)
	def unapply(media: Media): Option[(String)] = Some(media.value)
}