package com.paterake.spark.etl.model.event

import com.paterake.spark.etl.model.catalogue.DataCatalogueKey

/**
  * Created by rak on 07/12/2016.
  */
case class TransformPersist(dataSetId: Int, dataCatalogueKey: DataCatalogueKey, filePath: String) {

}
