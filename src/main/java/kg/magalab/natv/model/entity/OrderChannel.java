package kg.magalab.natv.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_order_channel")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderChannel extends AbstractPersistable<Long> {

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id", nullable = false)
    Order order;

    @ManyToOne
    @JoinColumn(name = "channel_id", referencedColumnName = "id", nullable = false)
    Channel channel;

}
