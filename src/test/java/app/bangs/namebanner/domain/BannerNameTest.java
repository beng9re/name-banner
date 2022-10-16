package app.bangs.namebanner.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class BannerNameTest {

    @DisplayName("배너 이름이 생성된다.")
    @Test
    void bannerName01() {
        BannerName bannerName = BannerName.from("배너");

        assertThat(bannerName.getName()).isEqualTo("배너");
    }

    @DisplayName("배너 이름들이 생성된다.")
    @Test
    void bannerName02() {
        var bannerNames = BannerName.from("배너", "이름");

        assertThat(bannerNames).extracting(BannerName::getName).contains("배너", "이름");
    }
}
