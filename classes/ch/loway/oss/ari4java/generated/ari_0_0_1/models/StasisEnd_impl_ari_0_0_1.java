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
 * Notification that a channel has left a Stasis application.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class StasisEnd_impl_ari_0_0_1 extends Event_impl_ari_0_0_1 implements StasisEnd, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_0_0_1.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}

