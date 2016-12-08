package com.paterake.spark.etl.model.etl

import com.paterake.spark.etl.model.catalogue.{DataCatalogue, DataCatalogueKey}

import scala.collection.mutable

/**
  * Created by rak on 07/12/2016.
  */
trait EtlBase {
  def dataCatalogueKey: DataCatalogueKey

  def etlAction: String

  var dataCatalogue: Option[DataCatalogue] = None: Option[DataCatalogue]

  var indPartition: Option[String] = None: Option[String]

  var mapPartition: Option[mutable.LinkedHashMap[String, String]] = None: Option[mutable.LinkedHashMap[String, String]]

}
