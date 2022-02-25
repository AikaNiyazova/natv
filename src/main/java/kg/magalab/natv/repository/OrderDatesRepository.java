package kg.magalab.natv.repository;

import kg.magalab.natv.model.entity.OrderDates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDatesRepository extends JpaRepository<OrderDates, Long> {
}
