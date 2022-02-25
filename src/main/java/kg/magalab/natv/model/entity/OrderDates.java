package kg.magalab.natv.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_order_dates")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDates extends AbstractPersistable<Long> {

    @ManyToOne
    @JoinColumn(name = "order_channel_id", referencedColumnName = "id", nullable = false)
    OrderChannel orderChannel;

    @Column(name = "ad_date", nullable = false)
    LocalDate adDate;

}
