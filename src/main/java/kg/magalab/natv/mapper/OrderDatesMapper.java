package kg.magalab.natv.mapper;

import kg.magalab.natv.model.dto.OrderDatesDto;
import kg.magalab.natv.model.entity.OrderDates;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderDatesMapper extends BaseMapper<OrderDates, OrderDatesDto> {
    OrderDatesMapper INSTANCE = Mappers.getMapper(OrderDatesMapper.class);
}
