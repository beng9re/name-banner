package app.bangs.namebanner.infra;

import app.bangs.namebanner.domain.BannerName;
import app.bangs.namebanner.domain.BannerNameRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface JpaBannerNameRepository extends BannerNameRepository, JpaRepository<BannerName, Long> {

}
