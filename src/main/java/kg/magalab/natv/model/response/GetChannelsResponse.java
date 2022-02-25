package kg.magalab.natv.model.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GetChannelsResponse {

    String channelName;
    String imageSource;
    BigDecimal pricePerSymbol;
    Integer percent;

}
