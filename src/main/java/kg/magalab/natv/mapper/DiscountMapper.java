package kg.magalab.natv.mapper;

import kg.magalab.natv.model.dto.DiscountDto;
import kg.magalab.natv.model.entity.Discount;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiscountMapper extends BaseMapper<Discount, DiscountDto> {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);
}
