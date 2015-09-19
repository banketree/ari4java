package ch.loway.oss.ari4java.generated.ari_1_7_0.models;

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
 * Asterisk system information
 * 
 * Defined in file: asterisk.json
 * Generated by: Model
 *********************************************************/

public class AsteriskInfo_impl_ari_1_7_0 implements AsteriskInfo, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Info about how Asterisk was built  */
  private BuildInfo build;
 public BuildInfo getBuild() {
   return build;
 }

 @JsonDeserialize( as=BuildInfo_impl_ari_1_7_0.class )
 public void setBuild(BuildInfo val ) {
   build = val;
 }

  /**  Info about Asterisk configuration  */
  private ConfigInfo config;
 public ConfigInfo getConfig() {
   return config;
 }

 @JsonDeserialize( as=ConfigInfo_impl_ari_1_7_0.class )
 public void setConfig(ConfigInfo val ) {
   config = val;
 }

  /**  Info about Asterisk status  */
  private StatusInfo status;
 public StatusInfo getStatus() {
   return status;
 }

 @JsonDeserialize( as=StatusInfo_impl_ari_1_7_0.class )
 public void setStatus(StatusInfo val ) {
   status = val;
 }

  /**  Info about the system running Asterisk  */
  private SystemInfo system;
 public SystemInfo getSystem() {
   return system;
 }

 @JsonDeserialize( as=SystemInfo_impl_ari_1_7_0.class )
 public void setSystem(SystemInfo val ) {
   system = val;
 }

/** No missing signatures from interface */
}

