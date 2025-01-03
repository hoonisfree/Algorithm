-- 코드를 입력하세요
SELECT fp.product_id, fp.product_name, sum(price * amount) as total_sales
from food_product fp
join food_order fo on fp.product_id = fo.product_id
where fo.produce_date like '%2022-05%'
group by fp.product_id
order by total_sales desc,1