create table POST
(
    POST_ID    BIGINT auto_increment,
    TITLE      VARCHAR(255),
    CONTENT    VARCHAR(255),
    VERSION    BIGINT,
    CREATED_AT DATETIME2,
    UPDATED_AT DATETIME,
    constraint POST_PK
        primary key (POST_ID)
);

create table COUNT_ATTRIBUTES
(
    COUNT_ATTRIBUTES_ID BIGINT not null auto_increment,
    VIEW_COUNT          BIGINT not null,
    VERSION             BIGINT,
    constraint COUNT_ATTRIBUTES_PK
        primary key (COUNT_ATTRIBUTES_ID)
);
