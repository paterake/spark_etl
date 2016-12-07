package com.paterake.spark.etl.model.etl

/**
  * Created by rak on 06/12/2016.
  */
case class EtlTargetSql(fileName: String, ordinal: Int) {
  val sqlText: Option[String] = scala.None: Option[String]

}
