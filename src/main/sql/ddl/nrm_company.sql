SELECT datname FROM pg_database
WHERE datistemplate = false;

create schema company;

create table company.nrm_company
( email_url         VARCHAR(255)
, company_name      VARCHAR(255)
, title             VARCHAR(255)
, first_name        VARCHAR(255)
, last_name         VARCHAR(255)
, job_title         VARCHAR(255)
, address_1         VARCHAR(255)
, address_2         VARCHAR(255)
, address_3         VARCHAR(255)
, town_city         VARCHAR(255)
, county            VARCHAR(255)
, post_code         VARCHAR(255)
, short_post_code   VARCHAR(255)
, telephone_no      VARCHAR(255)
, fax_no            VARCHAR(255)
, website_url       VARCHAR(255)
, employee_count    VARCHAR(255)
, turnover_amt      VARCHAR(255)
, business_type     VARCHAR(255)
, business_sector   VARCHAR(255)
, company_source    VARCHAR(255)
);

select count(*) from company.nrm_company;

truncate company.nrm_company;

commit;
