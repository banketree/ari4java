package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Sep 19 08:50:54 CEST 2015
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface Bridge extends EventSource  {

// void setBridge_type String
/**********************************************************
 * Type of bridge technology
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setBridge_type(String val );



// void setBridge_class String
/**********************************************************
 * Bridging class
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setBridge_class(String val );



// void setName String
/**********************************************************
 * Name the creator gave the bridge
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setName(String val );



// String getId
/**********************************************************
 * Unique identifier for this bridge
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getId();



// void setId String
/**********************************************************
 * Unique identifier for this bridge
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setId(String val );



// String getBridge_type
/**********************************************************
 * Type of bridge technology
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getBridge_type();



// String getName
/**********************************************************
 * Name the creator gave the bridge
 * 
 * @since ari_1_0_0
 *********************************************************/
 public String getName();



// String getCreator
/**********************************************************
 * Entity that created the bridge
 * 
 * @since ari_1_0_0
 *********************************************************/
 public String getCreator();



// void setTechnology String
/**********************************************************
 * Name of the current bridging technology
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setTechnology(String val );



// String getBridge_class
/**********************************************************
 * Bridging class
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getBridge_class();



// String getTechnology
/**********************************************************
 * Name of the current bridging technology
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getTechnology();



// List<String> getChannels
/**********************************************************
 * Ids of channels participating in this bridge
 * 
 * @since ari_0_0_1
 *********************************************************/
 public List<String> getChannels();



// void setChannels List<String>
/**********************************************************
 * Ids of channels participating in this bridge
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannels(List<String> val );



// void setCreator String
/**********************************************************
 * Entity that created the bridge
 * 
 * @since ari_1_0_0
 *********************************************************/
 public void setCreator(String val );


}
;
