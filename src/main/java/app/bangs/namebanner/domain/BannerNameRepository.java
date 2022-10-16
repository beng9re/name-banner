package app.bangs.namebanner.domain;

import java.util.List;

public interface BannerNameRepository {
    List<BannerName> findAll();

    <S extends BannerName> List<S> saveAll(Iterable<S> entities);
}
