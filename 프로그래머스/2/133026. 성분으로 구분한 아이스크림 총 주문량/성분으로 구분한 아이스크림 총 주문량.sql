-- 코드를 입력하세요
SELECT ingredient_type, sum(b.total_order) as total_order
from icecream_info a
join first_half b on a.flavor=b.flavor
group by ingredient_type
order by total_order