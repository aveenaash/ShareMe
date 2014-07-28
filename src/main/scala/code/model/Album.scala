package code.model

import net.liftweb.mapper._

class Album extends LongKeyedMapper[Album]
{
  def getSingleton = Album
  def primaryKeyField = id

  object id extends MappedLongIndex(this)
  object user extends MappedLongForeignKey(this, User)
  object albumname extends MappedString(this,100)
  object albumDesc extends MappedTextarea(this, 2048) {
    override def textareaRows  = 6
    override def textareaCols = 50
    override def displayName = "Description to the album"
  }

}

object Album extends Album with LongKeyedMetaMapper[Album]
{
//  def getAllList():List[Album] = transaction {
//    from(Album)(c => select(c)).toList
//  }
}