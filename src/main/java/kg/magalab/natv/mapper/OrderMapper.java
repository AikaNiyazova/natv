package kg.magalab.natv.mapper;

import kg.magalab.natv.model.dto.OrderDto;
import kg.magalab.natv.model.entity.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper extends BaseMapper<Order, OrderDto> {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
}
