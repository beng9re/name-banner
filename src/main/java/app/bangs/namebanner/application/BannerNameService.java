package app.bangs.namebanner.application;

import app.bangs.namebanner.domain.BannerNameRepository;
import app.bangs.namebanner.dto.BannerNameResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BannerNameService {

    private final BannerNameRepository bannerNameRepository;

    public List<BannerNameResponse> findAll() {
        return bannerNameRepository.findAll()
                .stream()
                .map((bannerName) -> new BannerNameResponse(bannerName.getName()))
                .collect(Collectors.toList());
    }
}
