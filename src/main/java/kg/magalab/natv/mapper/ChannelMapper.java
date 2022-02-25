package kg.magalab.natv.mapper;

import kg.magalab.natv.model.dto.ChannelDto;
import kg.magalab.natv.model.entity.Channel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChannelMapper extends BaseMapper<Channel, ChannelDto> {
    ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);

    @Override
    @Mapping(target = "isActive", ignore = true)
    Channel toEntity(ChannelDto channelDto);
}
