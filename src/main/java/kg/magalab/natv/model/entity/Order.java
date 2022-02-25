package kg.magalab.natv.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_order")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order extends AbstractPersistable<Long> {

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false)
    User user;

    @Column(name = "ad_text", nullable = false)
    String adText;

    @Column(name = "total_sum", nullable = false)
    BigDecimal totalSum;

}
