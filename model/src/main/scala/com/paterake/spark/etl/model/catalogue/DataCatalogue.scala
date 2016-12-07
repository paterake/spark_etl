package com.paterake.spark.etl.model.catalogue

import com.paterake.spark.etl.model.etl.EtlTargetDataFilter

/**
  * Created by rak on 06/12/2016.
  */
case class DataCatalogue(dataCatalogueKey: DataCatalogueKey
                         , format: String
                         , schemaIdentifier: String
                         , delimiter: String
                         , quote: String
                         , columnHeaderDataInd: String
                         , columnHeaderHeaderInd: String
                         , columnHeaderFooterInd: String
                         , countSplitHeader: Int
                         , countSplitFooter: Int
                         , retainHeaderInd: String
                         , retainFooterInd: String
                         , splitFileSuffixData: String
                         , splitFileSuffixHeader: String
                         , splitFileSuffixFooter: String
                         , headerDataType: String
                         , footerDataType: String
                         , rowTag: String
                         , fileNamePattern: String
                         , dateContext: DateContext
                        )