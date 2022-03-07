package io.shirohoo.github.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountAttributes implements Persistable<Long> {
    @Id
    @Column("COUNT_ATTRIBUTES_ID")
    private Long id;

    @Column("VIEW_COUNT")
    private Long viewCount;

    @Version
    @Column("VERSION")
    private Long version;

    @Override
    public boolean isNew() {
        return id == null;
    }
}
