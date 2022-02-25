package kg.magalab.natv.model.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetChannelsResponse {

    String channelName;
    String imageSource;
    String pricePerSymbol;
    String percent;

}
