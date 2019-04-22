package com.recurse.portfolio.data;

import com.recurse.portfolio.security.Visibility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@Builder
@Data
@Table("users")
public class User {
    @Id
    Integer userId;

    Integer recurseProfileId;

    Visibility profileVisibility;

    @Column("name_internal")
    @NonNull String internalName;

    @Column("name_public")
    String publicName;

    @Column("image_url_internal")
    String internalImageUrl;

    @Column("image_url_public")
    String publicImageUrl;

    @Column("bio_internal")
    String internalBio;

    @Column("bio_public")
    String publicBio;
}
