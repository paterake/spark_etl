package com.paterake.spark.etl.model.etl

import com.paterake.spark.etl.model.catalogue.{DataCatalogue, DataCatalogueKey}

import scala.collection.mutable

/**
  * Created by rak on 18/11/2016.
  */
class EtlBase (dataCatalogueKey: DataCatalogueKey, etlAction: String) {

  val dataCatalogue: DataCatalogue = null
  val indPartition: String = "Y"
  val mapPartition: mutable.LinkedHashMap[String, String] = null

}
