-- 코드를 입력하세요
SELECT category,sum(sales) as total_sales
from book b
left join book_sales s on b.book_id = s.book_id
where sales_date like '%2022-01%'
group by category
order by category