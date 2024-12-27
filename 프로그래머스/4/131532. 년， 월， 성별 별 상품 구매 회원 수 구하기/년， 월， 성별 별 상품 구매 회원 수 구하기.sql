-- 코드를 입력하세요
SELECT YEAR(a.sales_date) as YEAR, MONTH(a.sales_date) as MONTH, b.GENDER, count(distinct a.user_id) as USERS
from online_sale a
inner join user_info b on a.user_id=b.user_id
where b.gender is not null
group by YEAR,MONTH,gender