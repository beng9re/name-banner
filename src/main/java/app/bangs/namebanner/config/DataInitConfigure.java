package app.bangs.namebanner.config;

import app.bangs.namebanner.domain.BannerName;
import app.bangs.namebanner.domain.BannerNameRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
@RequiredArgsConstructor
public class DataInitConfigure {
    private final BannerNameRepository bannerNameRepository;

    @PostConstruct
    void init() {
        bannerNameRepository.saveAll(BannerName.from("이름", "사람", "한글"));
    }
}
