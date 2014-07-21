package code.model

import net.liftweb.mapper._

class Album extends LongKeyedMapper[Album]
{
  def getSingleton = Album
  def primaryKeyField = id

  object id extends MappedLongIndex(this)
  object albumname extends MappedString(this,100)

}

object Album extends Album with LongKeyedMetaMapper[Album]
{
//  def getAllList():List[Album] = transaction {
//    from(Album)(c => select(c)).toList
//  }
}