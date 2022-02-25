package kg.magalab.natv.controller;

import kg.magalab.natv.service.ChannelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/channel")
public class ChannelController {

    private final ChannelService channelService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getChannels() {
        try {
            log.info("Getting all channels");
            return ResponseEntity.ok(channelService.getChannels());
        } catch (RuntimeException ex) {
            log.error("Getting all channels failed. " + ex.getMessage());
            ex.printStackTrace();
            return ResponseEntity.status(HttpStatus.CONFLICT).body(ex.getMessage());
        }
    }

}
