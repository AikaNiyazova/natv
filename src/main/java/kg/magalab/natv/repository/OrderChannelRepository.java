package kg.magalab.natv.repository;

import kg.magalab.natv.model.entity.OrderChannel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderChannelRepository extends JpaRepository<OrderChannel, Long> {
}
