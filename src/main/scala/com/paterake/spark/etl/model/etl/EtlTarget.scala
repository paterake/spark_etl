package com.paterake.spark.etl.model.etl

import com.paterake.spark.etl.model.catalogue.DataCatalogueKey

/**
  * Created by rak on 07/12/2016.
  */
case class EtlTarget(dataCatalogueKey: DataCatalogueKey
                     , etlAction: String) extends EtlBase {
  var clcnEtlSql: Option[List[String]] = None: Option[List[String]]
  var clcnDataFilter: Option[List[EtlTargetDataFilter]] = None: Option[List[EtlTargetDataFilter]]
  var pathName: Option[String] = None: Option[String]

}
