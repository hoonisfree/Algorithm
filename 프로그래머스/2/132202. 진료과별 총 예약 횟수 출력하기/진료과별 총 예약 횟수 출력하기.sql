-- 코드를 입력하세요
SELECT MCDP_CD as '진료과 코드', count(*) as '5월예약건수'
from appointment
where DATE_FORMAT(apnt_ymd,'%Y-%m') = '2022-05'
group by 1
order by 2,1                  