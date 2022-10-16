package app.bangs.namebanner.domain;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Getter
public class BannerName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    protected BannerName() {}

    private BannerName(String name) {
        this.name = name;
    }

    public static BannerName from(String name) {
        return new BannerName(name);
    }

    public static List<BannerName> from(String... names) {
        return Arrays.stream(names)
                .map(BannerName::from)
                .collect(Collectors.toList());
    }

}
