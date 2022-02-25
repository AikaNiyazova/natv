package kg.magalab.natv.service;

import kg.magalab.natv.model.response.GetChannelsResponse;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface ChannelService {

    Page<GetChannelsResponse> getChannels();

}
