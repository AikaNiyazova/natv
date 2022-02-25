package kg.magalab.natv.service.impl;

import kg.magalab.natv.model.response.GetChannelsResponse;
import kg.magalab.natv.repository.ChannelRepository;
import kg.magalab.natv.service.ChannelService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChannelServiceImpl implements ChannelService {

    private final ChannelRepository channelRepository;

    @Override
    public Page<GetChannelsResponse> getChannels() {

        Pageable pageable = PageRequest.of(0, 10, Sort.by("channel_number"));
        Page<GetChannelsResponse> channelPage = channelRepository.joinChannels(pageable);
        if (channelPage.isEmpty()) {
            throw new RuntimeException("Dataset for tb_channels is empty");
        }
        return channelPage;
    }
}
