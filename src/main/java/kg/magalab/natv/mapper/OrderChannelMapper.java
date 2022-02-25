package kg.magalab.natv.mapper;

import kg.magalab.natv.model.dto.OrderChannelDto;
import kg.magalab.natv.model.entity.OrderChannel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderChannelMapper extends BaseMapper<OrderChannel, OrderChannelDto> {
    OrderChannelMapper INSTANCE = Mappers.getMapper(OrderChannelMapper.class);
}
