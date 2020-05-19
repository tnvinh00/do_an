CREATE TABLE QUANLI(
    ID          NUMBER(20) NOT NULL,
    MATKHAU     VARCHAR(25) NOT NULL
)
create or replace view bclk(lk, sl, m, y)
as
select l.loaikhach, count(distinct c.mapt) sl, extract(month from p.ngbd) m, extract(year from p.ngbd) y
from ((chitietpt c join khachhang k on c.cmnd=k.cmnd) 
    join loaikhach l on k.loaikhach=l.loaikhach) 
    join phieuthue p on c.mapt=p.mapt
group by l.loaikhach, extract(month from p.ngbd), extract(year from p.ngbd);

CREATE OR REPLACE FORCE EDITIONABLE VIEW "DO_AN"."TTKH" ("CM", "TEN", "LK", "DC", "SL") AS 
  select k.cmnd, k.hoten, k.loaikhach, k.diachi, a.sl
from khachhang k left join(select cmnd, count(cmnd) sl 
                            from chitietpt 
                            group by cmnd) a on a.cmnd=k.cmnd;

CREATE OR REPLACE FORCE EDITIONABLE VIEW "DO_AN"."BCLP" ("LP", "TT", "M", "Y") AS 
  select  l.loaiphong, sum(p.thanhtien) s, extract(month from p.ngbd) m, extract(year from p.ngbd) y
from    (phieuthue p join phong ph on p.sophong=ph.sophong) 
        join loaiphong l on l.loaiphong=ph.loaiphong
group by l.loaiphong, extract(month from p.ngbd), extract(year from p.ngbd);

CREATE ROLE DA_NGUOIDUNG NOT IDENTIFIED;
CREATE ROLE DA_QUANLI NOT IDENTIFIED;
alter session set "_ORACLE_SCRIPT"=true;

GRANT SELECT,INSERT ON DANGKYDV TO DA_NGUOIDUNG;
GRANT SELECT ON DICHVU TO DA_NGUOIDUNG;
GRANT SELECT ON KHACHHANG TO DA_NGUOIDUNG;
GRANT SELECT ON PHONG TO DA_NGUOIDUNG;
GRANT SELECT ON TTPHONG TO DA_NGUOIDUNG;
GRANT SELECT ON CTPHONG TO DA_NGUOIDUNG;
GRANT SELECT ON PHIEUTHUE TO DA_NGUOIDUNG;
GRANT UPDATE ON NGUOIDUNG TO DA_NGUOIDUNG;
GRANT CONNECT TO DA_NGUOIDUNG;

GRANT SELECT,INSERT,UPDATE,DELETE ON CHITIETPT TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON DANGKYDV TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON DANGKYKM TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON DICHVU TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON KHACHHANG TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON KHUYENMAI TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON LOAIKHACH TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON LOAIPHONG TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON NGUOIDUNG TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON PHIEUTHUE TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON PHONG TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON BCLK TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON BCLP TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON CTPHONG TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON TTKH TO DA_QUANLI;
GRANT SELECT,INSERT,UPDATE,DELETE ON TTPHONG TO DA_QUANLI;
GRANT select, UPDATE ON QUANLI TO DA_QUANLI;

GRANT CONNECT TO DA_QUANLI;
create user q1111 IDENTIFIED by 1234;
grant da_quanli to q1111;
insert into quanli values ('1111', '1234');
DROP ROLE DA_NGUOIDUNG;
DROP ROLE DA_QUANLI;


