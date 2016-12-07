package com.paterake.spark.etl.model.etl

import com.paterake.spark.etl.model.catalogue.DataCatalogueKey

/**
  * Created by rak on 30/11/2016.
  */
case class EtlSource(dataCatalogueKey: DataCatalogueKey
                     , etlAction: String
                    , inputFileName: String
                    , inputFileLocation: String
                    , dataCatalogueKeyAlias: String
                    ) extends EtlBaseTrait{
  var targetFilePath = None:Option[String]
}
