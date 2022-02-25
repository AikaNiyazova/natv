package kg.magalab.natv.model.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_channel")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Channel extends AbstractPersistable<Long> {

    @Column(name = "channel_name", nullable = false, length = 50)
    String channelName;

    @Column(name = "image_source", nullable = false, length = 50)
    String imageSource;

    @Column(name = "channel_number", nullable = false, unique = true)
    Integer channelNumber;

    @Column(name = "is_active", nullable = false, columnDefinition = "BOOLEAN DEFAULT TRUE")
    Boolean isActive;

}
