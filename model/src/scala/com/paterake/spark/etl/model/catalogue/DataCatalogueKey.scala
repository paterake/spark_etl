package com.paterake.spark.etl.model.catalogue

import scala.collection.mutable

/**
  * Created by rak on 18/11/2016.
  */
case class DataCatalogueKey (name: String, level: String, hashKey: mutable.LinkedHashMap[String, String])
