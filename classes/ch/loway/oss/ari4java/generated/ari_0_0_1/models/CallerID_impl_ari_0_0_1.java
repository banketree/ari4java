package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Sep 19 08:50:54 CEST 2015
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Caller identification
 * 
 * Defined in file: channels.json
 * Generated by: Model
 *********************************************************/

public class CallerID_impl_ari_0_0_1 implements CallerID, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

  /**    */
  private String number;
 public String getNumber() {
   return number;
 }

 @JsonDeserialize( as=String.class )
 public void setNumber(String val ) {
   number = val;
 }

/** No missing signatures from interface */
}

