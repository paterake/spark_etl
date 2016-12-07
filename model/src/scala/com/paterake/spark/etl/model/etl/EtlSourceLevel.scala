package com.paterake.spark.etl.model.etl

import com.paterake.spark.etl.model.catalogue.DataCatalogueKey

/**
  * Created by rak on 30/11/2016.
  */
case class EtlSourceLevel(dataCatalogueKey: DataCatalogueKey
                          , etlAction: String
                          , dataCatalogueKeyAlias: String
                          , registrationName: String) extends EtlSourceTrait{
}
