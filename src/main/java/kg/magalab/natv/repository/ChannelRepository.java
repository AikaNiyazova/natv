package kg.magalab.natv.repository;

import kg.magalab.natv.model.entity.Channel;
import kg.magalab.natv.model.response.GetChannelsResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface ChannelRepository extends PagingAndSortingRepository<Channel, Long> {

/*
    Pageable pageable = PageRequest.of(0, 10, Sort.by("channel_number"));
*/

    @Query(value = "SELECT c.channel_name, c.image_source, p.price_per_symbol, d.percent FROM tb_channel AS c " +
            "JOIN tb_price AS p ON c.id = p.channel_id " +
            "LEFT JOIN tb_discount AS d ON c.id = d.channel_id " +
            "WHERE c.is_active = true " +
            "ORDER BY c.channel_number",
            countQuery = "SELECT COUNT(*) FROM tb_channel WHERE is_active = true", nativeQuery = true)
    Page<GetChannelsResponse> joinChannels(Pageable pageable);

}
