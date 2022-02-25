package kg.magalab.natv.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountDto {

    Long id;
    ChannelDto channel;
    Integer percent;
    Integer activeFromNumberOfDays;
    LocalDate startDate;
    LocalDate endDate;

}
