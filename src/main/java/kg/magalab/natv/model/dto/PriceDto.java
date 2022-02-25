package kg.magalab.natv.model.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceDto {

    Long id;
    ChannelDto channel;
    BigDecimal pricePerSymbol;
    LocalDate startDate;
    LocalDate endDate;

}
