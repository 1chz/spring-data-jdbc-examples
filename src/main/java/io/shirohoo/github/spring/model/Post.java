package io.shirohoo.github.spring.model;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.Version;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post implements Persistable<Long> {
    @Id
    @Column("POST_ID")
    private Long id;

    @Column("TITLE")
    private String title;

    @Column("CONTENT")
    private String content;

    @Version
    @Column("VERSION")
    private Long version;

    @MappedCollection(idColumn = "COUNT_ATTRIBUTES_ID")
    private CountAttributes countAttributes;

    @CreatedDate
    @Column("CREATED_AT")
    private LocalDateTime createdAt;

    @LastModifiedBy
    @Column("UPDATED_AT")
    private LocalDateTime updatedAt;

    @Override
    public boolean isNew() {
        return id == null;
    }
}
