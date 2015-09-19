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


public interface ChannelCallerId {

// void setCaller_presentation int
/**********************************************************
 * The integer representation of the Caller Presentation value.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setCaller_presentation(int val );



// int getCaller_presentation
/**********************************************************
 * The integer representation of the Caller Presentation value.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public int getCaller_presentation();



// void setCaller_presentation_txt String
/**********************************************************
 * The text representation of the Caller Presentation value.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setCaller_presentation_txt(String val );



// Channel getChannel
/**********************************************************
 * The channel that changed Caller ID.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public Channel getChannel();



// String getCaller_presentation_txt
/**********************************************************
 * The text representation of the Caller Presentation value.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getCaller_presentation_txt();



// void setChannel Channel
/**********************************************************
 * The channel that changed Caller ID.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel(Channel val );


}
;
