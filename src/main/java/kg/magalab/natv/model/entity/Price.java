package kg.magalab.natv.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_price")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Price extends AbstractPersistable<Long> {

    @ManyToOne
    @JoinColumn(name = "channel_id", referencedColumnName = "id", nullable = false)
    Channel channel;

    @Column(name = "price_per_symbol", nullable = false)
    BigDecimal pricePerSymbol;

    @Column(name = "start_dateend_date", nullable = false)
    LocalDate startDate;

    @Column(name = "channel_name", nullable = false)
    LocalDate endDate;

}
