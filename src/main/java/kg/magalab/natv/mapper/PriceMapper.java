package kg.magalab.natv.mapper;

import kg.magalab.natv.model.dto.PriceDto;
import kg.magalab.natv.model.entity.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PriceMapper extends BaseMapper<Price, PriceDto> {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
}
