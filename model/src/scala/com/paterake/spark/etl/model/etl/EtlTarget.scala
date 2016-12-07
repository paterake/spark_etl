package com.paterake.spark.etl.model.etl

import com.paterake.spark.etl.model.catalogue.DataCatalogueKey

/**
  * Created by rak on 07/12/2016.
  */
case class EtlTarget(dataCatalogueKey: DataCatalogueKey
                     , etlAction: String) extends EtlBaseTrait {
  var clcnEtlSql = None : Option[ List[String]]
  var pathName = None : Option[String]

}
