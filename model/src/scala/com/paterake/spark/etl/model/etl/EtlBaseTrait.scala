package com.paterake.spark.etl.model.etl

import com.paterake.spark.etl.model.catalogue.{DataCatalogue, DataCatalogueKey}

import scala.collection.mutable

/**
  * Created by rak on 07/12/2016.
  */
trait EtlBaseTrait {
  def dataCatalogueKey: DataCatalogueKey

  def etlAction: String

  var dataCatalogue = None: Option[DataCatalogue]

  var indPartition = None: Option[String]

  var mapPartition = None: Option[mutable.LinkedHashMap[String, String]]

}
