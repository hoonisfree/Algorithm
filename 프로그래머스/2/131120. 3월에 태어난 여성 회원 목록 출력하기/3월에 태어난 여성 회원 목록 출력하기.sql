-- 코드를 입력하세요
SELECT member_id,member_name,gender,DATE_FORMAT(date_of_birth,'%Y-%m-%d') as date_of_birth
from member_profile
where substr(date_of_birth,6,7) = 03 and gender = 'W' and tlno is not null
order by member_id asc