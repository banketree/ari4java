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


public interface ChannelHold {

// String getMusicclass
/**********************************************************
 * The music on hold class that the initiator requested.
 * 
 * @since ari_1_8_0
 *********************************************************/
 public String getMusicclass();



// void setMusicclass String
/**********************************************************
 * The music on hold class that the initiator requested.
 * 
 * @since ari_1_8_0
 *********************************************************/
 public void setMusicclass(String val );



// Channel getChannel
/**********************************************************
 * The channel that initiated the hold event.
 * 
 * @since ari_1_8_0
 *********************************************************/
 public Channel getChannel();



// void setChannel Channel
/**********************************************************
 * The channel that initiated the hold event.
 * 
 * @since ari_1_8_0
 *********************************************************/
 public void setChannel(Channel val );


}
;
