package cron4s.core

/**
  * Created by alonsodomin on 31/12/2015.
  */
trait Bound[T] {

  def min: T
  def max: T

}