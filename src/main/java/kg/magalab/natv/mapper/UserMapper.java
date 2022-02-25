package kg.magalab.natv.mapper;

import kg.magalab.natv.model.dto.UserDto;
import kg.magalab.natv.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper extends BaseMapper<User, UserDto> {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
}
