package kg.magalab.natv.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelDto {

    Long id;
    String channelName;
    String imageSource;
    Integer channelNumber;

}
