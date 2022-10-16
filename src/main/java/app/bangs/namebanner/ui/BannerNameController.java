package app.bangs.namebanner.ui;

import app.bangs.namebanner.application.BannerNameService;
import app.bangs.namebanner.domain.BannerName;
import app.bangs.namebanner.dto.BannerNameResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class BannerNameController {
    private final BannerNameService bannerNameService;

    @GetMapping("/v1/BannerNames")
    public ResponseEntity<List<BannerNameResponse>> names() {
        return ResponseEntity.ok(bannerNameService.findAll());
    }

}
