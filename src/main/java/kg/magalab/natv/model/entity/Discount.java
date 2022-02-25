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
@Table(name = "tb_discount")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Discount extends AbstractPersistable<Long> {

    @ManyToOne
    @JoinColumn(name = "channel_id", referencedColumnName = "id", nullable = false)
    Channel channel;

    @Column(name = "percent", nullable = false)
    Integer percent;

    @Column(name = "active_from_number_of_days", nullable = false)
    Integer activeFromNumberOfDays;

    @Column(name = "start_date", nullable = false)
    LocalDate startDate;

    @Column(name = "end_date", nullable = false)
    LocalDate endDate;

}
