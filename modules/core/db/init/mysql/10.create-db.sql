-- begin PKSBTEST_REQUEST_STORAGE_LINE
create table PKSBTEST_REQUEST_STORAGE_LINE (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    CONTAINER_NUMBER varchar(255),
    HOUSEKEEPING_REQUIRED boolean,
    CLEANING_REQUIRED boolean,
    STUFFING_REQUIRED boolean,
    REPAIR varchar(255),
    CONTAINER_ID varchar(32),
    TEMPERATURE integer,
    LOCATION varchar(255),
    TEMPERATURE_START integer,
    CABLING_REQUIRED boolean,
    LOT_NUMBER integer,
    REMARKS varchar(255),
    PLUG_ON boolean,
    PLUG_OFF boolean,
    REQUEST_STORAGE_ID varchar(32) not null,
    --
    primary key (ID)
)^
-- end PKSBTEST_REQUEST_STORAGE_LINE
-- begin PKSBTEST_REQUEST_STORAGE
-- end PKSBTEST_REQUEST_STORAGE
-- begin PKSBTEST_CONTAINER
create table PKSBTEST_CONTAINER (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    CONTAINER_NUMBER varchar(255),
    CONTAINER_TYPE varchar(50),
    STATUS varchar(255),
    --
    primary key (ID)
)^
-- end PKSBTEST_CONTAINER
-- begin PKSBTEST_REQUEST
create table PKSBTEST_REQUEST (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    CUSTOMER varchar(255),
    DATE_ datetime(3),
    LOCATION varchar(255),
    TICKET_NUMBER varchar(255),
    STATUS varchar(255),
    --
    primary key (ID)
)^
-- end PKSBTEST_REQUEST
