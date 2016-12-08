package com.paterake.spark.etl.model.etl

import com.paterake.spark.etl.model.catalogue.DataCatalogueKey

/**
  * Created by rak on 30/11/2016.
  */

sealed trait EtlSource extends EtlBase

case class EtlSourceFile(dataCatalogueKey: DataCatalogueKey
                         , etlAction: String
                         , inputFileName: String
                         , inputFileLocation: String) extends EtlSource {
  var targetFilePath: Option[String] = None: Option[String]
}

case class EtlSourceLevel(dataCatalogueKey: DataCatalogueKey
                          , etlAction: String
                          , dataCatalogueKeyAlias: String
                          , registrationName: String) extends EtlSource {
}
